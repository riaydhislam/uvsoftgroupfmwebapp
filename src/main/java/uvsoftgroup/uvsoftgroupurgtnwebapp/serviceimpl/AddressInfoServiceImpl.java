package uvsoftgroup.uvsoftgroupurgtnwebapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uvsoftgroup.uvsoftgroupurgtnwebapp.model.AddressInfo;
import uvsoftgroup.uvsoftgroupurgtnwebapp.repository.AddressInfoRepository;
import uvsoftgroup.uvsoftgroupurgtnwebapp.service.AddressInfoService;

@Service
public class AddressInfoServiceImpl implements AddressInfoService {
	@Autowired
	private  AddressInfoRepository  addressInfoRepository;



	public void saveAddressInfo(AddressInfo addressInfo) throws Exception {
		addressInfoRepository.save(addressInfo);
		
	}

	
	public List<AddressInfo> findAllAddressInfo() {
		List<AddressInfo> listUR=(List<AddressInfo>) addressInfoRepository.findAll();
		if(!listUR.isEmpty()){
			return listUR;		
		}
		else{
			return new ArrayList<AddressInfo>(listUR);
		}
	}


	public AddressInfo findAddressInfo(Long urId) {
		AddressInfo addressInfo=addressInfoRepository.findOne(urId);
		if(addressInfo!=null){
			return addressInfo;		
		}
		else{
			return new AddressInfo();
		}
	}

	
	public AddressInfo deleteAddressInfo(Long urId) {
		AddressInfo addressInfo=addressInfoRepository.findOne(urId);
		
		if(addressInfo!=null && addressInfo.getAdId()!=null){
			addressInfoRepository.delete(addressInfo.getAdId());
			return addressInfo;
		}
		else{
			return new AddressInfo();
		}
	}

	@Override
	public void updateAddressInfo(Long urId, AddressInfo addressInfo) {
		AddressInfo addressInfoExisting=addressInfoRepository.findOne(urId);
		
		if(addressInfoExisting!=null && addressInfoExisting.getAdId()!=null){
			addressInfoRepository.save(addressInfo);
			
		}
		
	
		
	}

}
