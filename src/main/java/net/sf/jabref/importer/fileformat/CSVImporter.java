package net.sf.jabref.importer.fileformat;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;


import net.sf.jabref.importer.ImportFormatReader;
import net.sf.jabref.importer.OutputPrinter;
import net.sf.jabref.logic.layout.format.GetBibtexType;
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
                be.setType(new GetBibtexType().format(fields[0]));
                be.setField( "isbn", fields[1]);
                be.setCiteKey( fields[2]);
                be.setField( "author", fields[3]);
                be.setField( "title", fields[4]);
                be.setField( "journal", fields[5]);
                be.setField( "volume", fields[6]);
                be.setField( "number", fields[7]);
                be.setField( "month", fields[8]);
                be.setField( "pages", fields[9]);
                be.setField( "year", fields[10]);
                be.setField( "address", fields[11]);
                be.setField( "note", fields[12]);
                be.setField( "url", fields[13]);
                be.setField( "booktitle", fields[14]);
                be.setField( "chapter", fields[15]);
                be.setField( "edition", fields[16]);
                be.setField( "series", fields[17]);
                be.setField( "publisher", fields[18]);
                be.setField( "reporttype", fields[19]);
                be.setField( "howpublished", fields[20]);
                be.setField( "institution", fields[21]);
                be.setField( "organization", fields[22]);
                be.setField( "school", fields[23]);
                be.setField( "annote", fields[24]);
                be.setField( "assignee", fields[25]);
                be.setField( "day", fields[26]);
                be.setField( "dayfield", fields[27]);
                be.setField( "monthfield", fields[28]);
                be.setField( "yearfield", fields[29]);
                be.setField( "language", fields[30]);
                
                
                bibitems.add(be);
                line = in.readLine();
            }
        }
        return bibitems;
    }
}