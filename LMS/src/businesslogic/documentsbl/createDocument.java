package businesslogic.documentsbl;

//import mockObject.MockGetPosition;

import businesslogicservice.documentsblservice.createDocumentBlSer;

public class createDocument implements createDocumentBlSer{

	@Override
	public String createDocument(String doName) {
		// TODO Auto-generated method stub
//		DocumentVO in=new DocumentVO();
//		if(doName.equals("入库单")){
//			in=new InBillsVO("0000001","入库单", null, null, null,0,0,0,0);
//			
//			MockGetPosition mock=new MockGetPosition();
//			DepotVO vo=mock.position();
//			((InBillsVO) in).setAreaNum(vo.getQu());
//			((InBillsVO) in).setRowNum(vo.getPai());
//			((InBillsVO) in).setRowNum(vo.getJia());
//			((InBillsVO) in).setSositionNum(vo.getWei());
//		}
		return null; 
	}

}