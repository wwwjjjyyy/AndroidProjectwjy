package tool;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class SendGet {
	/*
	此类是用来发送get请求的
	url：要发送的地址
	pargam：要传输的数据
	 */
	public static String SendGet(String url,String pargam){
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("http://119.3.230.115:8080/TomcatServers"+url+"?"+pargam);
        String response = null;
        try{
            HttpResponse httpResponse = httpClient.execute(httpGet);
            if(httpResponse.getStatusLine().getStatusCode() == 200){
                HttpEntity entity = httpResponse.getEntity();
                response = EntityUtils.toString(entity,"utf-8");
                //System.out.println(response);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
		//String html = Request.Get("http://119.3.230.115:8080/TomcatServers"+url+"?"+pargam).execute().returnContent().asString(Charset.forName("UTF-8"));
		return response;
	}
}
