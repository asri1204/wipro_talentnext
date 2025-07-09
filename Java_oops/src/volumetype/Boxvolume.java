package volumetype;

public class Boxvolume {
	int width;
	int height;
	int depth;
	public Boxvolume(int w, int h, int d) {
		width = w; 
		height =h;
		depth = d;
	}
public int volume() {
	int volume = width * height * depth;
	return volume;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boxvolume box = new Boxvolume(10, 20, 30);
		int result = box.volume();
	System.out.println(result);
	}
}




