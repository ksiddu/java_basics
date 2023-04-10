package com.sid.collectionConcepts;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiTest {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		VideoResponse rs = null;
		int hdCountTrue = 0;
		int hdCountFalse = 0;
		int pageNo = 1;
		Map<String, Integer> countryMap = new HashMap<>();
		do {
			HttpResponse<String> response = HttpClient.newBuilder().build()
					.send(HttpRequest.newBuilder()
							.uri(new URI("https://api.viki.io/v4/videos.json?app=100250a&per_page=10&page=" + pageNo))
							.GET().build(), HttpResponse.BodyHandlers.ofString());

			Gson gson = new Gson();
			rs = gson.fromJson(response.body(), VideoResponse.class);
			for (VideoDetail videoDetail : rs.response) {
				if (videoDetail.flags.hd) {
					hdCountTrue++;
				} else {
					hdCountFalse++;
				}
				countryMap.put(videoDetail.container.origin.country,
						countryMap.getOrDefault(videoDetail.container.origin.country, 0) + 1);
			}
			pageNo++;
		} while (rs.more);
		System.out.println("Total Pages : " + (pageNo-1));
		countryMap.forEach((k, v) -> System.out.println("Country : " + k + "  Count: " + v));
		System.out.println("HD False Count : " + hdCountFalse);
		System.out.println("HD True Count : " + hdCountTrue);
	}

	public class VideoResponse {
		private boolean more;
		private List<VideoDetail> response = new ArrayList<>();
	}

	public class VideoDetail {
		public Flags flags;
		public Container container;
	}

	public class Flags {
		public boolean hd;
	}

	public class Container {
		public Origin origin;
	}

	public class Origin {
		public String country;
	}
}
