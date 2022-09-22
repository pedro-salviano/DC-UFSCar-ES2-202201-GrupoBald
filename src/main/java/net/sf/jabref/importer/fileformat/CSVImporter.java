package net.sf.jabref.importer.fileformat;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;


import net.sf.jabref.importer.ImportFormatReader;
import net.sf.jabref.importer.OutputPrinter;
import net.sf.jabref.model.entry.BibEntry;
import net.sf.jabref.model.entry.BibtexEntryTypes;

public class CSVImporter extends ImportFormat {

    @Override
    public String getFormatName() {
        return "Simple CSV Importer";
    }

    @Override
    public String getExtensions() {
        return "csv";
    }

    @Override
    public String getDescription() {
        return "Imports CSV files, where every field is separated by a semicolon.";
    }

    @Override
    public boolean isRecognizedFormat(InputStream in) {
        return true; // this is discouraged except for demonstration purposes
    }

    @Override
    public List<BibEntry> importEntries(InputStream stream, OutputPrinter status) throws IOException {
        List<BibEntry> bibitems = new ArrayList<>();
        BufferedReader in = new BufferedReader(ImportFormatReader.getReaderDefaultEncoding(stream));

        String line = in.readLine();
        while (line != null) {
            if (!line.trim().isEmpty()) {
                String[] fields = line.split(",");
                BibEntry be = new BibEntry();
                be.setType(BibtexEntryTypes.TECHREPORT);
                be.setField("year", fields[0]);
                be.setField("author", fields[1]);
                be.setField("title", fields[2]);
                bibitems.add(be);
                line = in.readLine();
            }
        }
        return bibitems;
    }
}