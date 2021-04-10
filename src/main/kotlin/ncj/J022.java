package ncj;

public class J022 {
    public void merge(int A[], int m, int B[], int n) {
        int total=m+n-1;
        int ia=m-1;
        int ib=n-1;
        while(ia>=0 && ib>=0)A[total--]=A[ia]>B[ib]?A[ia--]:B[ib--];
        if(ib>=0) System.arraycopy(B,0,A,0,ib+1);
    }
}
