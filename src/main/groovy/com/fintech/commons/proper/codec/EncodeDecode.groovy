package com.fintech.commons.proper.codec

import org.apache.commons.codec.binary.Base64

import java.nio.charset.StandardCharsets

public class EncodeDecode {

    public static void execute() {
        String textToBeEncode = "Hi, It is Sample of Encode and Decode In Base64"
        // ---Encode Data---
        byte[] encoded = Base64.encodeBase64(textToBeEncode.getBytes())
        String encodedText = new String(encoded)
        // ---Decode Data---
        byte[] decoded = Base64.decodeBase64(encodedText.getBytes())
        String decodedText = new String(decoded)
        println("Base64 Encoding/Decoding - Apache Commons")
        println("-----------------------------------------")
        println("textToBeEncode......: " + textToBeEncode)
        println("EncodedText.....: " + encodedText)
        println("DecodedText.....: " + decodedText)
        println()

        encoded = Base64.encodeBase64(textToBeEncode
                .getBytes(StandardCharsets.UTF_8))
        encodedText = new String(encoded, StandardCharsets.UTF_8)
        // ---Decode Data---
        decoded = Base64.decodeBase64(encodedText
                .getBytes(StandardCharsets.UTF_8))
        decodedText = new String(decoded, StandardCharsets.UTF_8)
        println("\n\n-----------------------------------------")
        println("Base64 Encoding/Decoding - Apache Commons With UTF")
        println("textToBeEncode......: " + textToBeEncode)
        println("EncodedText.....: " + encodedText)
        println("DecodedText.....: " + decodedText)
        println()
    }
}
