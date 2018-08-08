package com.jacoblucas.adventofcode.java2017;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class InputReader {
    static List<String> read(String filename) throws IOException {
        InputStream is = InputReader.class.getClassLoader().getResourceAsStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        List<String> data = new ArrayList<String>();
        String line = br.readLine();
        while (line != null) {
            data.add(line);
            line = br.readLine();
        }
        return data;
    }
}
