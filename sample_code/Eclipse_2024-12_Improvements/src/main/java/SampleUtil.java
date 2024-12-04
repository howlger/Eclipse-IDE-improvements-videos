public class SampleUtil {

	long getVotes(String votes, boolean isUpVote) {
		return new Java23().countCharA(votes, isUpVote ? '+' : '-');
	}

}