package dessignpattern.strategy.sort;

public class QuickSorter implements Sorter {
	@SuppressWarnings("rawtypes")
	Comparable[] data;

	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] data) {
		this.data = data;
		quickSort(0, data.length - 1);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void quickSort(int pre, int post) {
		int saved_pre = pre;
		int saved_post = post;
		Comparable mid = data[(pre + post) / 2];
		do {
			while (data[pre].compareTo(mid) < 0) {
				pre++;
			}
			while(mid.compareTo(data[post]) < 0) {
				post--;
			}
			if(pre <= post) {
				Comparable tmp = data[pre];
				data[pre] = data[post];
				data[post] = tmp;
				pre++;
				post--;
			}
		} while(pre <= post);
		if(saved_pre < post) {
			quickSort(saved_pre, post);
		}
		if(pre < saved_post) {
			quickSort(pre, saved_post);
		}

	}

}
