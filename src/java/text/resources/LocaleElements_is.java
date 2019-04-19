/*
 * @(#)LocaleElements_is.java	1.9 98/01/13
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

public class LocaleElements_is extends ListResourceBundle {
    /**
     * Overrides ListResourceBundle
     */
    public Object[][] getContents() {
        return new Object[][] {
            { "LocaleString", "is_IS" }, // locale id based on iso codes
            { "LocaleID", "040f" }, // Windows id
            { "ShortLanguage", "isl" }, // iso-3 abbrev lang name
            { "ShortCountry", "ISL" }, // iso-3 abbrev country name
            { "Languages", // language names
                new String[][] {
                    { "is", "\u00edslenska" }
                }
            },
            { "Countries", // country names
                new String[][] {
                    { "IS", "\u00cdsland" }
                }
            },
            { "MonthNames",
                new String[] {
                    "jan\u00faar", // january
                    "febr\u00faar", // february
                    "mars", // march
                    "apr\u00edl", // april
                    "ma\u00ed", // may
                    "j\u00fan\u00ed", // june
                    "j\u00fal\u00ed", // july
                    "\u00e1g\u00fast", // august
                    "september", // september
                    "okt\u00f3ber", // october
                    "n\u00f3vember", // november
                    "desember", // december
                    "" // month 13 if applicable
                }
            },
            { "MonthAbbreviations",
                new String[] {
                    "jan.", // abb january
                    "feb.", // abb february
                    "mar.", // abb march
                    "apr.", // abb april
                    "ma\u00ed", // abb may
                    "j\u00fan.", // abb june
                    "j\u00fal.", // abb july
                    "\u00e1g\u00fa.", // abb august
                    "sep.", // abb september
                    "okt.", // abb october
                    "n\u00f3v.", // abb november
                    "des.", // abb december
                    "" // abb month 13 if applicable
                }
            },
            { "DayNames",
                new String[] {
                    "sunnudagur", // Sunday
                    "m\u00e1nudagur", // Monday
                    "\u00feri\u00f0judagur", // Tuesday
                    "mi\u00f0vikudagur", // Wednesday
                    "fimmtudagur", // Thursday
                    "f\u00f6studagur", // Friday
                    "laugardagur" // Saturday
                }
            },
            { "DayAbbreviations",
                new String[] {
                    "sun.", // abb Sunday
                    "m\u00e1n.", // abb Monday
                    "\u00feri.", // abb Tuesday
                    "mi\u00f0.", // abb Wednesday
                    "fim.", // abb Thursday
                    "f\u00f6s.", // abb Friday
                    "lau." // abb Saturday
                }
            },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###;-#,##0.###", // decimal pattern
                    "#,##0.## 'kr.';-#,##0.## 'kr.'", // currency pattern
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
                    "kr.", // local currency symbol
                    "ISK", // intl currency symbol
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
                    "d.M.yyyy", // medium date pattern
                    "d.M.yyyy", // short date pattern
                    "{1} {0}" // date-time pattern
                }
            },
            { "CollationElements",
                /* for IS_IS, accents sorted backwards plus the following: */

                "@"                                           /* sort accents bkwd */
                /* assuming that in the default collation we add:                   */
                /*  thorn, ae ligature, o-diaeresis, and o-slash                    */
                /*  ....in this order...and ditto for the uppercase of these....    */
                /* to be treated as characters (not accented characters) after z    */
                /* then we don't have to add anything here. I've just added it here */
                /* just in case it gets overlooked.                                 */
                + "& A < a\u0301, A\u0301 "       // nt : A < a-acute
                + "& D < \u00f0, \u00d0"          // nt : d < eth
                + "& E < e\u0301, E\u0301 "       // nt : e < e-acute
                + "& I < i\u0301, I\u0301 "       // nt : i < i-acute
                + "& O < o\u0301, O\u0301 "       // nt : o < o-acute
                + "& U < u\u0301, U\u0301 "       // nt : u < u-acute
                + "& Y < y\u0301, Y\u0301 "       // nt : y < y-acute
                + "& Z < \00fe, \u00de < \u00e6, \u00c6" // nt : z < thron < �
                + "< o\u0308, O\u0308 ; \u00f8, \u00d8" // nt : o-umlaut ; o-stroke
            }
        };
    }
}
