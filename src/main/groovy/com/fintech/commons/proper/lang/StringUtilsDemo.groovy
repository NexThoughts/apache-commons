package com.fintech.commons.proper.lang

import org.apache.commons.lang3.RegExUtils
import org.apache.commons.lang3.StringUtils

class StringUtilsDemo {

    public static void execute() {
        println " \n\n ***** Check String Null Or Empty ** "
        checkStringIsNullOrEmpty()
        println " \n\n ***** Equals Examples ** "
        equalsAndCompare()
        println " \n\n ***** Contains Examples ** "
        containExample()
        println " \n\n ***** Abbreviate Examples ** "
        abbreviateExample()
        println " \n\n ***** Prepand And Append Examples ** "
        prepandAndAppendExample()
        println " \n\n *****  RegexUtils Examples ** "
        regexUtilExample()
    }

    private static void checkStringIsNullOrEmpty() {
        String textSample = "It Contains Text."
        String blankSample = ""
        String nullSample = null
        println "====== Checking textSample isNull Or Empty --- ${StringUtils.isEmpty(textSample)}"
        println "====== Checking textSample isNull Or Empty --- ${StringUtils.isBlank(blankSample)}"
        println "====== Checking textSample isNull Or Empty --- ${StringUtils.isEmpty(nullSample)}"
    }

    private static void equalsAndCompare() {
        String originalString = "Fintechlabs"
        String copiedString = "fintechlabs"
        println "====== Is both String are equals --- ${StringUtils.equalsIgnoreCase(originalString, copiedString)}"
        String textValue = "Fintechlabs"
        println "====== Find String Any Regex --- ${StringUtils.equalsAnyIgnoreCase(copiedString, textValue, "nexthoughts")}"
    }

    private static void containExample() {
        String testString = "It is apache commons StringUtils demo."
        println "====== Is String Contains blank('')-- - ${StringUtils.containsAny(testString, "")} "
        println "====== Is String Contains apache --- ${StringUtils.containsAny(testString, "apache")}"
        println "====== Is String Contains xyz or demo --- ${StringUtils.containsAny(testString, "xyz", "demo")}"
        println "====== Is String Contains whiteSpaces --- ${StringUtils.containsWhitespace(testString)}"
        println "====== Is String Contains whiteSpaces --- ${StringUtils.containsWhitespace(testString)}"
        println "====== Is String Contains only commons --- ${StringUtils.containsOnly(testString, "commons")}"
        println "====== Is String Contains None blank('')--- ${StringUtils.containsNone(testString, "")}"
    }

    private static void abbreviateExample() {
        String text = "StringUtils"
        println "====== Abbreviate Of Text 'StringUtils' at maxWidth 4 --- ${StringUtils.abbreviate(text, 4)}"
        println "====== Abbreviate Of Text 'StringUtils' at maxWidth 5 --- ${StringUtils.abbreviate(text, 5)}"
        println "====== Abbreviate Of Text 'StringUtils' at maxWidth 6 --- ${StringUtils.abbreviate(text, 6)}"
        println "====== Abbreviate Of Text 'StringUtils' at maxWidth 6  and offset 3--- ${StringUtils.abbreviate(text, 3, 6)}"
        println "====== Abbreviate Of Text 'StringUtils' with Replacement Marker (*)--- ${StringUtils.abbreviate(text, "**", 6)}"

    }

    private static void prepandAndAppendExample() {
        String textForAppend = "Fintech"
        println "====== Append 'Labs' into Fintech If it Is Missing --- ${StringUtils.appendIfMissing(textForAppend, "Labs")}"
        println "====== Append 'Labs' into FintechLabs If it Is Missing --- ${StringUtils.appendIfMissingIgnoreCase(textForAppend + "Labs", "Labs")}"
        String textForPrepand = "thoughts"
        println "====== Append 'Nex' into ${textForPrepand} If it Is Missing --- ${StringUtils.prependIfMissing(textForPrepand, "Nex")}"
        println "====== Append 'nex' into ${"Nex" + textForPrepand} If it Is Missing --- ${StringUtils.prependIfMissingIgnoreCase("Nex" + textForPrepand, "nex")}"
    }

    private static void regexUtilExample() {
        //StringUtils is depreciated, so we must use RegExUtils
        println "====== REPLAECE 'ABCabc123' with regex pattern ---${RegExUtils.replacePattern("ABCabc123", "[a-z]", "_")}"
        println "====== REPLAECE 'ABCabc123' with regex pattern ---${RegExUtils.replacePattern("ABCabc123", "[^A-Z0-9]+", "")}"
        println "====== REPLAECE 'ABCabc123' with regex pattern ---${RegExUtils.replacePattern("ABCabc123", "[^A-Z0-9]+", "_")}"
        println "====== REPLAECE 'ABCabc123' with regex pattern ---${RegExUtils.replacePattern("White Space are replaced with underscore(-)", "( +)([a-z]+)", "_\$2")}"
    }
}
