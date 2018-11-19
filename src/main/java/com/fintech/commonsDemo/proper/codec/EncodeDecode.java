package com.fintech.commonsDemo.proper.codec;

import org.apache.commons.codec.binary.Base64;

import java.nio.charset.StandardCharsets;

public class EncodeDecode {

    public static void execute() {
        String textToBeEncode = "Hi, It is Sample of Encode and Decode In Base64";
        // ---Encode Data---
        byte[] encoded = Base64.encodeBase64(textToBeEncode.getBytes());
        String encodedText = new String(encoded);
        // ---Decode Data---
        byte[] decoded = Base64.decodeBase64(encodedText.getBytes());
        String decodedText = new String(decoded);
        System.out.println("Base64 Encoding/Decoding - Apache Commons");
        System.out.println("-----------------------------------------");
        System.out.println("textToBeEncode......: " + textToBeEncode);
        System.out.println("EncodedText.....: " + encodedText);
        System.out.println("DecodedText.....: " + decodedText);
        System.out.println();

        encoded = Base64.encodeBase64(textToBeEncode
                .getBytes(StandardCharsets.UTF_8));
        encodedText = new String(encoded, StandardCharsets.UTF_8);
        // ---Decode Data---
        decoded = Base64.decodeBase64(encodedText
                .getBytes(StandardCharsets.UTF_8));
        decodedText = new String(decoded, StandardCharsets.UTF_8);
        System.out.println("\n\n-----------------------------------------");
        System.out.println("Base64 Encoding/Decoding - Apache Commons With UTF");
        System.out.println("textToBeEncode......: " + textToBeEncode);
        System.out.println("EncodedText.....: " + encodedText);
        System.out.println("DecodedText.....: " + decodedText);
        System.out.println();
    }
}
