package api.coseke.main.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import api.coseke.main.database.DatabaseConnectivity;
import api.coseke.main.monitor.FolderMonitor;

public class FileReaderCompo {
	
    private static String Errorstate;
    private static String LastAccessedDocument;
    private static String NextDocId;
    private static String NextPagId;
    private static String State;
    private static String key;
    private static String Locked;
    private static String NoOCRImageSize;
    private static String BacksRescanned;
    private static String CreatedUserID;
    private static String ImageCountGrayscale;
    private static String ImageCountGrayscaleBack;
    private static String ModifiedDatetime;
    private static String FrontsCaptured;
    private static String BacksCaptured;
    private static String BacksDeleted;
    private static String CreatedDatetime;
    private static String Index0005;
    private static String ModifiedUserID;
    private static String OutputStartDatetime;
    private static String ImageAddress;
    private static String ImageCountBlackWhiteFront;
    private static String ImageCountColorFront;
    private static String Index0006;
    private static String ModifiedWorkstationID;
    private static String PageCount;
    private static String BacksRemoved;
    private static String FirstDocumentID;
    private static String ImageCountBlackWhiteBack;
    private static String ImageCountColor;
    private static String ImageCountColorBack;
    private static String ImageCountGrayscaleFront;
    private static String ModifiedWorkstationName;
    private static String StartingDocumentID;
    private static String CreatedWorkstationID;
    private static String DocumentCount;
    private static String ImageCountBlackWhite;
    private static String LastDocumentID;
    private static String Index0001;
    private static String Location;
    private static String OutputUserID;
    private static String SizeOfImages;
    private static String CreatedWorkstationName;
    private static String ImageCount;
    private static String Index0002;
    private static String OutputServerAddress;
    private static String OutputWorkstationID;
    private static String FrontsDeleted;
    private static String FrontsRescanned;
    private static String Index0003;
    private static String OutputWorkstationName;
    private static String FrontsRemoved;
    private static String Index0004;
    
	public void readInfoFileData(String fileName) throws SQLException, Throwable {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			String lineArray [] ;

			String infoFromfile="",
					results="";

			while (line != null) {
				lineArray = line.split("=");
				infoFromfile=lineArray[0].trim();
				if(lineArray.length==2) {
					results = lineArray[1];

				}
				
				if(infoFromfile=="batch.errorstate"){

					Errorstate = results;
				}
				if(infoFromfile.equalsIgnoreCase("batch.LastAccessedDocument")){

					LastAccessedDocument = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.next_doc_id")){

					NextDocId = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.next_pag_id")){

					NextPagId = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.state")){

					State = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("key")){

					key = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.locked")){

					Locked = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.NoOCRImage.Size")){

					NoOCRImageSize = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.BacksRescanned")){

					BacksRescanned = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.CreatedUserID")){

					CreatedUserID = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ImageCount_Grayscale")){

					ImageCountGrayscale = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ImageCount_Grayscale_Back")){

					ImageCountGrayscaleBack = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ModifiedDatetime")){

					ModifiedDatetime = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.FrontsCaptured")){

					FrontsCaptured = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.BacksCaptured")){

					BacksCaptured = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.BacksDeleted")){

					BacksDeleted = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.CreatedDatetime")){

					CreatedDatetime = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.Index0005")){

					Index0005 = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ModifiedUserID")){

					ModifiedUserID  = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.OutputStartDatetime")){

					OutputStartDatetime = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ImageAddress")){

					ImageAddress = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ImageCount_BlackWhite_Front")){

					ImageCountBlackWhiteFront = results;
				}
						
				if(infoFromfile.equalsIgnoreCase("batch.ImageCount_Color_Front")){

					ImageCountColorFront = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.Index0006")){

					Index0006 = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ModifiedWorkstationID")){

					ModifiedWorkstationID = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.PageCount")){

					PageCount = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.BacksRemoved ")){

					BacksRemoved = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.FirstDocumentID ")){

					FirstDocumentID = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ImageCount_BlackWhite_Back ")){

					ImageCountBlackWhiteBack = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ImageCount_Color ")){

					ImageCountColor = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ImageCount_Color_Back ")){

					ImageCountColorBack = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ImageCount_Grayscale_Front ")){

					ImageCountGrayscaleFront = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ModifiedWorkstationName ")){

					ModifiedWorkstationName = results;
				}
								
				if(infoFromfile.equalsIgnoreCase("batch.StartingDocumentID ")){

					StartingDocumentID = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.CreatedWorkstationID")){

					CreatedWorkstationID = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.DocumentCount")){

					DocumentCount = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ImageCount_BlackWhite")){

					ImageCountBlackWhite = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.LastDocumentID")){

					LastDocumentID = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.Index0001")){

					Index0001 = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.Location")){

					Location = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.OutputUserID")){

					OutputUserID = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.SizeOfImages")){

					SizeOfImages = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.CreatedWorkstationName")){

					CreatedWorkstationName = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.ImageCount")){

					ImageCount = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.Index0002")){

					Index0002 = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.OutputServerAddress")){

					OutputServerAddress = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.OutputWorkstationID")){

					OutputWorkstationID = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.FrontsDeleted")){

					FrontsDeleted = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.FrontsRescanned")){

					FrontsRescanned = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.Index0003")){

					Index0003 = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.OutputWorkstationName")){

					OutputWorkstationName = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.FrontsRemoved ")){

					FrontsRemoved = results;
				}
				
				if(infoFromfile.equalsIgnoreCase("batch.Index0004")){

					Index0004  = results;
				}

				line = reader.readLine();
				System.out.println(results);
			}
			reader.close();
			saveInfoFileData();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveInfoFileData() {
		String SQL = "INSERT INTO infofiletable values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try{	
			Connection con = DatabaseConnectivity.ConnectToDB();
			PreparedStatement Pstmt = con.prepareStatement(SQL);
			
		Pstmt.setString(1,PageCount);
		Pstmt.setString(2,CreatedUserID);
		Pstmt.setString(3,CreatedDatetime);
		Pstmt.setString(4,ModifiedUserID);
		Pstmt.setString(5,ModifiedWorkstationID);
		Pstmt.setString(6,Location);
		Pstmt.setString(7,ModifiedWorkstationName);
		Pstmt.setString(8,Errorstate);
		Pstmt.setString(9,Index0004);
		Pstmt.setString(10,OutputWorkstationName);
		Pstmt.setString(11,FrontsRemoved);
		Pstmt.setString(12,Index0003);
		Pstmt.setString(13,FrontsRescanned);
		Pstmt.setString(14,FrontsDeleted);
		Pstmt.setString(15,OutputWorkstationID);
		Pstmt.setString(16,OutputServerAddress);
		Pstmt.setString(17,Index0002);
		Pstmt.setString(18,ImageCount);
		Pstmt.setString(19,CreatedWorkstationName);
		Pstmt.setString(20,SizeOfImages);
		Pstmt.setString(21,OutputUserID);
		Pstmt.setString(22,Index0001);
		Pstmt.setString(23,LastDocumentID);
		Pstmt.setString(24,ImageCountBlackWhite);
		Pstmt.setString(25,CreatedWorkstationID);
		Pstmt.setString(26,DocumentCount);
		Pstmt.setString(27,StartingDocumentID);
		Pstmt.setString(28,ImageCountGrayscaleFront);
		Pstmt.setString(29,ImageCountColorBack);
		Pstmt.setString(30,ImageCountColor);
		Pstmt.setString(31,ImageCountBlackWhiteBack);
		Pstmt.setString(32,BacksRemoved);
		Pstmt.setString(33,FirstDocumentID);
		Pstmt.setString(34,Index0006);
		Pstmt.setString(35,ImageCountColorFront);
		Pstmt.setString(36,ImageCountBlackWhiteFront);
		Pstmt.setString(37,ImageAddress);
		Pstmt.setString(38,LastAccessedDocument);
		Pstmt.setString(39,NextDocId);
		Pstmt.setString(40,NextPagId);
		Pstmt.setString(41,State);
		Pstmt.setString(42,Locked);
		Pstmt.setString(43,NoOCRImageSize);
		Pstmt.setString(44,BacksRescanned);
		Pstmt.setString(45,ImageCountGrayscale);
		Pstmt.setString(46,ImageCountGrayscaleBack);
		Pstmt.setString(47,FrontsCaptured);
		Pstmt.setString(48,ModifiedDatetime);
		Pstmt.setString(49,BacksCaptured);
		Pstmt.setString(50,BacksDeleted);
		Pstmt.setString(51,Index0005);
		Pstmt.setString(52,OutputStartDatetime);
		Pstmt.executeUpdate();
		
		} catch (Exception e) {
			System.err.println("Error is caused by: " + e.getMessage());
			e.printStackTrace();
		} 
   }

	public static void watchFolder() throws Throwable {
		FolderMonitor.fileMonitor();	
	
	}
}