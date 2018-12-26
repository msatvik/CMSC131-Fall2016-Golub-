package p4_student;

import cmsc131PhotoLibrary.Photograph;
import cmsc131PhotoLibrary.Pixel;

/**
 * This class will be written by the Student.  It provides various
 * static methods that take a photograph and produce a new one based
 * on it, but with various modifications.
 * 
 * See the project description for details of method implementations.
 * 
 * @author CMSC 131 Student
 *
 */
public class PhotoTools {


	//THIS METHOD IS PROVIDED AS A STARTING POINT.  PLEASE READ THROUGH
	//  IT AND THINK ABOUT WHAT IT DOES AND WHY - IF YOU AREN'T SURE OF
	//  SOMETHING, ASK US IN OFFICE HOURS!
	public static Photograph copy(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(x, y));
			}
		}
		return newPhoto;
	}





	//THIS METHOD IS TO ISOLATE RED (TYPE 0) OR BLUE (TYPE 1) OUT OF THE ORIGINAL PICTURE
	public static Photograph isolateColor(Photograph photo, int type) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(x, y));
			}
		}
		
		if (type==0){
			for (int x=0; x<photo.getWd(); x++){
				for (int y=0; y<photo.getHt(); y++){
					newPhoto.setPixel(x, y, new Pixel(newPhoto.getPixel(x, y).getRed(), 0, 0));
				}
			}
		}
		else if (type==1){
			for (int x=0; x<photo.getWd(); x++){
				for (int y=0; y<photo.getHt(); y++){
					newPhoto.setPixel(x, y, new Pixel(0, 0, newPhoto.getPixel(x, y).getBlue()));
				}
			}
		}
		return newPhoto;
	}





	public static Photograph makeGrayscale(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(x, y));
			}
		}
		
		for (int x=0; x<photo.getWd(); x++){
			for (int y=0; y<photo.getHt(); y++){
				int grayValue = (int)(newPhoto.getPixel(x, y).getRed() * 0.3) +
				                (int)(newPhoto.getPixel(x, y).getGreen() * 0.6) +
				                (int)(newPhoto.getPixel(x, y).getBlue() * 0.1);
				newPhoto.setPixel(x, y, new Pixel(grayValue,grayValue,grayValue));
			}
		}
		return newPhoto;
	}



	public static Photograph makeArtistic(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(x, y));
			}
		}
		
		for (int x=0; x<photo.getWd(); x++){
			for (int y=0; y<photo.getHt(); y++){
				int totalPixel= newPhoto.getPixel(x, y).getRed() + newPhoto.getPixel(x, y).getGreen() + newPhoto.getPixel(x, y).getBlue();
				if (totalPixel>0&&totalPixel<154)
				newPhoto.setPixel(x, y, new Pixel(0,0,0));
				else if (totalPixel>153&&totalPixel<307)
					newPhoto.setPixel(x, y, new Pixel(63,63,63));
				else if (totalPixel>306&&totalPixel<460)
					newPhoto.setPixel(x, y, new Pixel(127,127,127));
				else if (totalPixel>459&&totalPixel<613)
					newPhoto.setPixel(x, y, new Pixel(191,191,191));
				else if (totalPixel>612&&totalPixel<766)
					newPhoto.setPixel(x, y, new Pixel(255,255,255));
			}
		}
		return newPhoto;
	}



	public static Photograph censorIt(Photograph photo) {
		Photograph newPhoto=new Photograph(photo.getWd(),photo.getHt());
		
		for(int x=0; x<photo.getWd();x+=10){
			for(int y=0; y<photo.getHt();y+=10){
				int avgred=0;
				int avggreen=0;
				int avgblue=0;
				for(int i=x; i<x+10;i++){
					for(int j=y;j<y+10;j++){
						Pixel name=photo.getPixel(i, j);
						avgred+=(int)(name.getRed());
						avggreen+=(int)(name.getGreen());
						avgred+=(int)(name.getBlue());
						newPhoto.setPixel(i, j, new Pixel(avgred,avggreen,avgblue));
					}
				}
				avgred/=100;
				avggreen/=100;
				avgblue/=100;
				for(int i=x; i<x+10; i++){
					for(int j=y;j<y+10;j++){
						newPhoto.setPixel(i, j, new Pixel(avgred,avggreen,avgblue));
					}
				}
			}
		}
	return newPhoto;

	}
		

		//HINT: To deal with the edge cases, you'll want to 
		//      check you aren't going out of bounds in the
		//      middle of your nested nesting of loops...


	


	public static Photograph stretched(Photograph photo, int type) {
		Photograph newPhoto =new Photograph(1,1);
		if (type==0){
			newPhoto = new Photograph(2*photo.getWd(), photo.getHt());
			for (int x=0; x<newPhoto.getWd(); x++) {
				for (int y=0; y<newPhoto.getHt(); y++) {
					newPhoto.setPixel(x, y, photo.getPixel(x/2, y));
				}
			}
		}
		else if (type==1){
			newPhoto = new Photograph(photo.getWd(), 2*photo.getHt());
			for (int x=0; x<newPhoto.getWd(); x++) {
				for (int y=0; y<newPhoto.getHt(); y++) {
					newPhoto.setPixel(x, y, photo.getPixel(x, y/2));
				}
			}
		}
		return newPhoto;
	}



	public static Photograph mirrorIt(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(photo.getWd()-x-1, y, photo.getPixel(x, y));
			}
		}
		return newPhoto;
	}



	public static Photograph makeDoubleWithMirror(Photograph photo) {
		Photograph newPhoto = new Photograph(2*photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(photo.getWd()-x-1, y, photo.getPixel(x, y));
			}
		}
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(photo.getWd()+x, y, photo.getPixel(x, y));
			}
		}
		return newPhoto;
	}

	public static Photograph rotated(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getHt(), photo.getWd());
		for (int x=0; x<photo.getHt(); x++) {
			for (int y=0; y<photo.getWd(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(y, photo.getHt()-1-x));
			}
		}
		return newPhoto;
	}

	public static Photograph upsideDown(Photograph photo) {
		Photograph newPhoto = new Photograph(photo.getWd(), photo.getHt());
		for (int x=0; x<photo.getWd(); x++) {
			for (int y=0; y<photo.getHt(); y++) {
				newPhoto.setPixel(x, y, photo.getPixel(photo.getWd()-1-x, photo.getHt()-1-y));
			}
		}
		return newPhoto;
	}
}
