package businesslogic.documentsbl;

import vo.storageVO.DepotVO;
import businesslogic.storagebl.OutDepot.OutDepotBL;
import businesslogicservice.modelservice.storageInfo.UpdateSpaceSer;

public class UpdateSpace implements UpdateSpaceSer{
	//此处仅和出库单有关
	private OutDepotBL out;
	@Override
	public void updateDrive(String city,String qu, String pai, String jia, String wei) {
		// TODO Auto-generated method stub
		DepotVO vo = new DepotVO(Integer.parseInt(qu), Integer.parseInt(pai), Integer.parseInt(jia), Integer.parseInt(wei));
		out = new OutDepotBL();
		out.outDepot(vo);
	}
}
