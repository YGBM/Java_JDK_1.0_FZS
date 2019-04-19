/*
 * @(#)LocaleElements_da.java	1.7 98/01/13
 *
 * (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996, 1997 - All Rights Reserved
 *
 * Portions copyright (c) 1996 Sun Microsystems, Inc. All Rights Reserved.
 *
 *   The original version of this source code and documentation is copyrighted
 * and owned by Taligent, Inc., a wholly-owned subsidiary of IBM. These
 * materials are provided under terms of a License Agreement between Taligent
 * and Sun. This technology is protected by multiple US and International
 * patents. This notice and attribution to Taligent may not be removed.
 *   Taligent is a registered trademark of Taligent, Inc.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */

/**
 *
 * Table of Java supplied standard locale elements
 *
 * automatically generated by java LocaleTool LocaleElements.java
 *
 * Date Created: Wed Aug 21 15:47:57  1996
 *
 *     Locale Elements and Patterns:  last update 10/23/96
 *
 *
 */

// WARNING : the format of this file will change in the future!

package java.text.resources;

import java.util.ListResourceBundle;

public class LocaleElements_da extends ListResourceBundle {
    /**
     * Overrides ListResourceBundle
     */
    public Object[][] getContents() {
        return new Object[][] {
            { "LocaleString", "da_DK" }, // locale id based on iso codes
            { "LocaleID", "0406" }, // Windows id
            { "ShortLanguage", "dan" }, // iso-3 abbrev lang name
            { "ShortCountry", "DNK" }, // iso-3 abbrev country name
            { "Languages", // language names
                new String[][] {
                    { "da", "dansk" }
                }
            },
            { "Countries", // country names
                new String[][] {
                    { "DK", "Danmark" }
                }
            },
            { "MonthNames",
                new String[] {
                    "januar", // january
                    "februar", // february
                    "marts", // march
                    "april", // april
                    "maj", // may
                    "juni", // june
                    "juli", // july
                    "august", // august
                    "september", // september
                    "oktober", // october
                    "november", // november
                    "december", // december
                    "" // month 13 if applicable
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "jan", // abb january
                    "feb", // abb february
                    "mar", // abb march
                    "apr", // abb april
                    "maj", // abb may
                    "jun", // abb june
                    "jul", // abb july
                    "aug", // abb august
                    "sep", // abb september
                    "okt", // abb october
                    "nov", // abb november
                    "dec", // abb december
                    "" // abb month 13 if applicable
                }
            },
            { "DayNames",
                new String[] {
                    "s\u00f8ndag", // Sunday
                    "mandag", // Monday
                    "tirsdag", // Tuesday
                    "onsdag", // Wednesday
                    "torsdag", // Thursday
                    "fredag", // Friday
                    "l\u00f8rdag" // Saturday
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "s\u00f8", // abb Sunday
                    "ma", // abb Monday
                    "ti", // abb Tuesday
                    "on", // abb Wednesday
                    "to", // abb Thursday
                    "fr", // abb Friday
                    "l\u00f8" // abb Saturday
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###;-#,##0.###", // decimal pattern
                    "kr #,##0.00;kr -#,##0.00", // currency pattern
                    "#,##0%" // percent pattern
                }
            },
            { "NumberElements",
                new String[] {
                    ",", // decimal separator
                    ".", // group (thousands) separator
                    ";", // list separator
                    "%", // percent sign
                    "0", // native 0 digit
                    "#", // pattern digit
                    "-", // minus sign
                    "E", // exponential
                    "\u2030", // per mille
                    "\u221e", // infinity
                    "\ufffd" // NaN
                }
            },
            { "CurrencyElements",
                new String[] {
                    "kr", // local currency symbol
                    "DKK", // intl currency symbol
                    "," // monetary decimal separator
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "HH:mm:ss z", // full time pattern
                    "HH:mm:ss z", // long time pattern
                    "HH:mm:ss", // medium time pattern
                    "HH:mm", // short time pattern
                    "d. MMMM yyyy", // full date pattern
                    "d. MMMM yyyy", // long date pattern
                    "dd-MM-yyyy", // medium date pattern
                    "dd-MM-yy", // short date pattern
                    "{1} {0}" // date-time pattern
                }
            },
            { "DateTimeElements",
                new String[] {
                    "2", // first day of week
                    "4" // min days in first week
                }
            },
            { "CollationElements",
                "& A < \u00e6\u0301 , \u00c6\u0301" // A < ae-acute
                + "& Z < \u00e6 , \u00c6" // Z < ae
                + "; a\u0308 , A\u0308 "       // a-umlaut
                + "< \u00f8 , \u00d8 ; o\u0308 , O\u0308 "  // o-stroke ; o-umlaut
                + "; o\u030b, O\u030b"        // nt :  o-double-acute
                + "< a\u030a , A\u030a"       // a-ring
                + ", aa , aA , Aa , AA "      // after a-ring
                + " & V, w, W "
                + "& Y ; u\u0308 , U\u0308"   // j1.1.4 : � is eq. to y.
            }
        };
    }
}
