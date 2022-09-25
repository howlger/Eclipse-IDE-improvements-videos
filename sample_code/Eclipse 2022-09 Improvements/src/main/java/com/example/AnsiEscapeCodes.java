package com.example;
class AnsiEscapeCodes {
    private static final String ESCAPE = "\u001b[";
    private static final String BOLD = ESCAPE + "1;";
    private static final String RESET = ESCAPE + "m";

    // see https://github.com/mihnita/ansi-econsole/wiki#features
    public static void main(String[] args) {
		System.out.println("""
				ANSI attributes: \u001b[37;1m\\u001b[\u001b[m\u001b[1;3;38;5;153mn\u001b[m\u001b[1;37mm\u001b[m (or \u001b[1;37m\\u001b[\u001b[m\u001b[1;3;38;5;153mn;m;...\u001b[m\u001b[1;37mm\u001b[m) ... \u001b[1;37m\\u001b[m\u001b[m (reset)
				 1 (22)    \u001b[37m-\u001b[m \u001b[1mbold\u001b[m (off)
				 3 (23)    \u001b[37m-\u001b[m \u001b[3mitalic\u001b[m (off)
				 4/21 (24) \u001b[37m-\u001b[m \u001b[4munderline/\u001b[21mdouble\u001b[m (off)
				 9 (29)    \u001b[37m-\u001b[m \u001b[9mstrikethrough\u001b[m (off)
				 7 (27)    \u001b[37m-\u001b[m \u001b[7minvert\u001b[m (off)
				51 (54)    \u001b[37m-\u001b[m \u001b[51mframed\u001b[m (off)
				 8 (28)    \u001b[37m-\u001b[m \u001b[8mhidden\u001b[m (off)""");
		System.out.print("30..37 + 90..97   \u001b[37m-\u001b[m 16 text colors       (8 low + 8 high): ");
		for (int i = 0; i < 16; i++) {
			System.out.print(  (i == 8 ? RESET + " + " : "")
					         + BOLD
					         + ((i < 8 ? 30 : (90 - 8)) + i)
					         + "mA");
		}
		System.out.println(RESET);
		System.out.print("40..47 + 100..107 \u001b[37m-\u001b[m 16 background colors (8 low + 8 high): ");
		for (int i = 0; i < 16; i++) {
			System.out.print(  (i == 8 ? RESET + " + " : "")
					         + BOLD
					         + (i < 8 ? "38;2;255;255;255;" : "")
					         + ((i < 8 ? 40 : (100 - 8)) + i)
					         + "mA");
		}
		System.out.println(RESET);
		System.out.print("38;5;n \u001b[37m-\u001b[m 256 text colors (8+8 + 6*36 + 24):                ");
		for (int i = 0; i < 256; i++) {
			System.out.print(  (i == 8 ? RESET + "   " : "")
					         + ((i + 16) % 36 == 32 ? RESET + "\n" + " ".repeat(42) : "")
					         + BOLD
					         + "38;5;"
					         + i
					         + "mA");
		}
		System.out.println(RESET);
		System.out.print("48;5;n \u001b[37m-\u001b[m 256 background colors (8+8 + 6*36 + 24):          ");
		for (int i = 0; i < 256; i++) {
			System.out.print(  (i == 8 ? RESET + "   " : "")
					+ ((i + 16) % 36 == 32 ? RESET + "\n" + " ".repeat(42) : "")
					+ BOLD
					+ "48;5;"
					+ i
					+ "m ");
		}
		System.out.println();
		var s = "38/48;2;r;g;b - text/background true color                              ";
		for (int i = 0; i < s.length(); i++) {
			var h = 1f/s.length()*i;
			System.out.print(  BOLD
					         + "48;2;"
					         + toRgb(h)
					         + ";"
					         + toRgb(h + 1/3f)
					         + ";"
					         + toRgb(h + 2/3f)
					         + ";38;2;"
					         + toRgb(h + 1/2f)
					         + ";"
					         + toRgb(h + 1/2f + 1/3f)
					         + ";"
					         + toRgb(h + 1/2f + 2/3f)
					         + "m"
					         + s.substring(i, i + 1));
		}
		System.out.println(RESET);
	}

    static int toRgb(float h) {
        if(h > 1f) h -= 1f;
        if(h > 1f) h -= 1f;
    	if (h < 1/6f || h > 5f/6f) return 255;
    	if (h < 1/3f) return (int) (-256 * (h - 1/3f) * 6f);
    	if (h > 2/3f) return (int) (256 * (h - 2/3f) * 6f);
    	return 0;
    }

}
