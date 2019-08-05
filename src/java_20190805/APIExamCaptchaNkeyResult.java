package java_20190805;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class APIExamCaptchaNkeyResult {
	public static void main(String[] args) {
        String clientId = "okFrLduuzIA3Hg3bMPhd";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "aGOGaHX9LG";//애플리케이션 클라이언트 시크릿값";
        try {
            String code = "0"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
            String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            //System.out.println(response.toString());
            JSONParser jsonParse = new JSONParser();
    		JSONObject jsonObj = (JSONObject) jsonParse.parse(
    				response.toString()); 
    		String key =  (String)jsonObj.get("key");
    		response.setLength(0);
    		response.append(key);
    		System.out.println(key);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}