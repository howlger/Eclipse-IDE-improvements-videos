package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Manifest;

class ManifestReader {

	public static void main(String[] args) throws IOException {
		try (InputStream in = ManifestReader.class.getResourceAsStream("../../META-INF/MANIFEST.MF")) {
			Manifest manifest = new Manifest(in);
			var key = "key";
			System.out.println(key + ": " + manifest.getMainAttributes().getValue(key));
		}
	}

}
