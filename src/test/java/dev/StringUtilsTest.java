package dev;

public class StringUtilsTest {
	public static void main(String[] args) throws Exception {
		testlevenshteinDistance();
	}
	
	public static void testlevenshteinDistance() throws Exception{

		int result1 = StringUtils.levenshteinDistance("chat", "chats");
		if(result1 != 1){
			throw new Exception("test 1 not pass");
		}
		int result2 = StringUtils.levenshteinDistance("machins", "machine");
		if(result2 != 1){
			throw new Exception("test 2 not pass");
		}
		int result3 = StringUtils.levenshteinDistance("aviron", "avion");
		if(result3 != 1){
			throw new Exception("test 3 not pass");
		}
		int result4 = StringUtils.levenshteinDistance("distance", "instance");
		if(result4 != 2){
			throw new Exception("test 4 not pass");
		}
		int result5 = StringUtils.levenshteinDistance("chien", "chine");
		if(result5 != 2){
			throw new Exception("test 5 not pass");
		}
		int result6 = StringUtils.levenshteinDistance(null, null);
		if(result6 != -1){
			throw new Exception("test 6 not pass");
		}
	}
}
