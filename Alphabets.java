import java.util.*;
class Alphabets{
	public static int CountVowels(String str,int n){
		char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		int m = vowels.length;
		int count_vow =0;
		for(int i=0;i<n;i++){
			int flag=0;
			for(int j=0;j<m;j++){
				if(vowels[j] == str.charAt(i)){
					flag = 1;
				}
			}
			if(flag==1)
				count_vow++;
		}
		return count_vow;
	}
	public static void main(String args[]){
		String str = "Gopinath";
		int n = str.length();	
		int vowels = CountVowels(str,n);
		int consonants = n - vowels;
		System.out.println("VOWELS: "+vowels+" CONSONANTS: " +consonants);
	}
}
