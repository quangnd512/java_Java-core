package NenData;
import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class NenData {

	public static void main(String[] args) throws UnsupportedEncodingException, DataFormatException {
		// TODO Auto-generated method stub
		String input = "hjfyudxtuxutx jyfuyc yfyucyi yfuydcu tudsyr5sxyr kyfyucyu "
				+ "yifdutdut ydutxdut jydcyut iyfdy6udyt yduydu ydfuydut ycdutdyutx "
				+ "ydtuxty utdytxyt jkfgiufy khfyf kkfuy hjyfyi fyyu kfyuiy yfi jhcfyuj";
		byte[] inputData = input.getBytes("UTF-8");
		System.out.println("Length ban dau: "+input.length());
		
		byte[] out = new byte[100];
		Deflater defla = new Deflater();
		defla.setInput(inputData);
		defla.finish(); 
		int stringLength = defla.deflate(out);
		System.out.println("Length da nen: "+stringLength);
		
		//giai nen
		Inflater infl = new Inflater();
		infl.setInput(out, 0, out.length);
		byte[] deout = new byte[200];
		int dataLeght = infl.inflate(deout);
		infl.end();
		String output2 = new String(deout, 0, dataLeght);
		System.out.println("Output: "+output2);
		
	}

}
