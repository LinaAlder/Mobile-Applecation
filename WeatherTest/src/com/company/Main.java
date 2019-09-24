package com.company;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class coord {
    {
        "coord": {
        "lon": -0.13,
                "lat": 51.51
    },
        "weather": [
        {
            "id": 300,
                "main": "Drizzle",
                "description": "light intensity drizzle",
                "icon": "09d"
        }
  ],
        "base": "stations",
            "main": {
        "temp": 280.32,
                "pressure": 1012,
                "humidity": 81,
                "temp_min": 279.15,
                "temp_max": 281.15
    },
        "visibility": 10000,
            "wind": {
        "speed": 4.1,
                "deg": 80
    },
        "clouds": {
        "all": 90
    },
        "dt": 1485789600,
            "sys": {
        "type": 1,
                "id": 5091,
                "message": 0.0103,
                "country": "GB",
                "sunrise": 1485762037,
                "sunset": 1485794875
    },
        "id": 2643743,
            "name": "London",
            "cod": 200
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
	    URL url = new URL ("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
        InputStream stream = (InputStream) url.getContent();
        Scanner sc = new Scanner(stream);
        String data = "";
        while (sc.hasNextLine()) {
            data += sc.nextLine();
        }
        System.out.println(data);

        Gson gson = new Gson();

    }
}
