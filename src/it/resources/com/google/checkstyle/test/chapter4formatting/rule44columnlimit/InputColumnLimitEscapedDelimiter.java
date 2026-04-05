package com.google.checkstyle.test.chapter4formatting.rule44columnlimit;

/** Some javadoc. */
public class InputColumnLimitEscapedDelimiter {
  /** Some javadoc. */
  void testMethod1() {
    String text = "short";
    // violation below 'Line is longer than 100 characters (found 141).'
    // abc\\\""" this line is intentionally very long to trigger line length while keeping delimiter escaped and not toggling text block mode
    String other = "still short";
  }
}
