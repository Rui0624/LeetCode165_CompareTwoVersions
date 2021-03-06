
public class Solution {
	public int compareVersion(String version1, String version2) {
        int n1 = version1.length(), n2 = version2.length();
        int i = 0, j = 0, d1 = 0, d2 = 0;
        while(i < n1 || j < n2){
        	while(i < n1 && version1.charAt(i) != '.'){
        		d1 = d1 * 10 + (version1.charAt(i) - '0');
        		i++;
        	}
        	while(j < n2 && version2.charAt(j) != '.'){
        		d2 = d2 * 10 + (version2.charAt(j) - '0');
        		j++;
        	}
        	
        	if(d1 > d2)
        		return 1;
        	if(d1 < d2)
        		return -1;
        	d1 = 0;
        	d2 = 0;
        	i++;
        	j++;
        }
        return 0;
    }
	
}
