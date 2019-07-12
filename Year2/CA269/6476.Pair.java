public class Pair<T1, T2>{
	T1 sec1;
	T2 sec2;
	public Pair(T1 name, T2 num){
		sec1 = name;
		sec2 = num;
	}
	public String toString()
	{
		return sec1 + " " + sec2;
	}
}