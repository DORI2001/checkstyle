package com.puppycrawl.tools.checkstyle.checks.sizes.linelength;

public class InputLineLengthEscapedTextBlockDelimiters {

    // \"""
    // 123456789012345678901
    // \\""" \\"""
    // 123456789012345678901
    // a\\\""" 123456789012345678901

    String t = """
            123456789012345678901
            """;
}
