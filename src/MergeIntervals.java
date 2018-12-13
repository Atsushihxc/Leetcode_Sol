/**
 * why use a linkedlist?
 */


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
	public class Interval {
    int start;
    int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
	private class intvalComp implements Comparator <Interval>{
	@Override
	public int compare(Interval a, Interval b) {
		if(a.start<b.start) return -1;
		if(a.start>b.start) return 1;
		else return 0;
		
		
	}
    public List<Interval> merge(List<Interval> intervals) {
    	Collections.sort(intervals,new intvalComp());
    	LinkedList<Interval> merged = new LinkedList<>();
    	for(Interval intval: intervals) {
    	if (merged.isEmpty() || merged.getLast().end<intval.start) {
    		merged.add(intval);
    	}
    	else {
    		merged.getLast().end = Math.max(merged.getLast().end, intval.end);
    	}
        
    }
    	return merged;
	
	}
		
	}
	}
}


