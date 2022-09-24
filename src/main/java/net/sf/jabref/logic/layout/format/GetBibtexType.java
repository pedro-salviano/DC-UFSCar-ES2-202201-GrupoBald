/*  Copyright (C) 2003-2011 JabRef contributors.
    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/
///////////////////////////////////////////////////////////////////////////////
//  Filename: $RCSfile$
//  Purpose:  Atom representation.
//  Language: Java
//  Compiler: JDK 1.4
//  Authors:  Joerg K. Wegner
//  Version:  $Revision$
//            $Date$
//            $Author$
//
//  Copyright (c) Dept. Computer Architecture, University of Tuebingen, Germany
//
//  This program is free software; you can redistribute it and/or modify
//  it under the terms of the GNU General Public License as published by
//  the Free Software Foundation version 2 of the License.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU General Public License for more details.
///////////////////////////////////////////////////////////////////////////////

package net.sf.jabref.logic.layout.format;

import net.sf.jabref.logic.layout.LayoutFormatter;

/**
 * Change type of record to match the one used by OpenOffice formatter.
 *
 * Based on the RemoveBrackets.java class (Revision 1.2) by mortenalver
 * @author $author$
 * @version $Revision$
 */
public class GetBibtexType implements LayoutFormatter {

    @Override
    public String format(String fieldText) {
        if ("7".equalsIgnoreCase(fieldText)) {
            return "Article";
        }
        if ("1".equalsIgnoreCase(fieldText)) {
            return "Book";
        }
        if ("2".equalsIgnoreCase(fieldText)) {
            return "Booklet";
        }
        if ("4".equalsIgnoreCase(fieldText)) {
            return "Inbook";
        }
        if ("5".equalsIgnoreCase(fieldText)) {
            return "Incollection";
        }
        if ("6".equalsIgnoreCase(fieldText)) {
            return "Inproceedings";
        }
        if ("8".equalsIgnoreCase(fieldText)) {
            return "Manual";
        }
        if ("9".equalsIgnoreCase(fieldText)) {
            return "Mastersthesis";
        }
        if ("10".equalsIgnoreCase(fieldText)) {
            return "Misc";
        }
        if ("11".equalsIgnoreCase(fieldText)) {
            return "Other";
        }
        if ("9".equalsIgnoreCase(fieldText)) {
            return "Phdthesis";
        }
        if ("3".equalsIgnoreCase(fieldText)) {
            return "Proceedings";
        }
        if ("13".equalsIgnoreCase(fieldText)) {
            return "Techreport";
        }
        if ("14".equalsIgnoreCase(fieldText)) {
            return "Unpublished";
        }
        // Default, Miscelaneous
        return "Misc";
    }
}
