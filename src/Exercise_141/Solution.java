package Exercise_141;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static int numUniqueEmails(String[] emails) {
		Set<String> uniqueEmails = new HashSet<>();
		for (String email : emails) {
			String[] parts = email.split("@");
			String localName = parts[0];
			String domainName = parts[1];
			localName = localName.replaceAll("\\.", "");
			localName = localName.split("\\+")[0];
			String uniqueEmail = localName + "@" + domainName;
			uniqueEmails.add(uniqueEmail);
		}
		return uniqueEmails.size();
	}
	
	public static void main(String[] args) {
		String[] emailStrings = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
		System.out.println(numUniqueEmails(emailStrings));
	}
}
