package teamd.hello;

import java.util.HashMap;
import java.util.Map;

public class Piyo 
{
	private Map<String, String> idPassMap = new HashMap<String, String>()
	{
		{put("hoge", "piyo");}
		{put("hoyo", "hoyoyo");}
		{put("oyo", "oyoyo");}
	};
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World" );
    }
	
	public String getPassword(String userId) {
		return idPassMap.get(userId);
	}
}
