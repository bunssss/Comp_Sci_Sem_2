package pkg;
import java.util.Scanner;
import java.util.Random;


public class ModMed {

public int getMedian(int[] a) {
int c = 0;
int d = 0;
while(c < a.length) {
	d=a[c]
	if(a[c+1] < d) {
		a[c+1]=a[c];
		a[c]=a[c+1];
	}
	c++;
}

int e = (a.length)-1;
e=e/2;
return a[e];
}

public int getMode(int[] b) {
	int c = 0;
	int e = 0;
	int d = b[e];
	int x = 0;
	int count = 0;
	
	while(e < b.length) {
		if(d==b[c+1]) {
			count++;
			c++;
		}
		else{
			c++;
		}
		if(count == 0 || c>=a.length) {
			c=0;
			e++;
			d=b[e];
		}
		if(count > 0) {
			x = d[e];
		}
	}
	if(count==0) {
		return -1;
	}
	if(count > 0){
	return x;
	}
}

