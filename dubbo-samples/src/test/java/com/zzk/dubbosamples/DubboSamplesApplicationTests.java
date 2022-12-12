package com.zzk.dubbosamples;

import com.uaepay.cmf.service.facade.api.VerifySignFacade;
import com.uaepay.cmf.service.facade.domain.verify.VerifySignRequest;
import com.uaepay.cmf.service.facade.domain.verify.VerifySignResult;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboSamplesApplication.class)
public  class DubboSamplesApplicationTests {

	@DubboReference(interfaceClass = VerifySignFacade.class,url = "dubbo://sim.nodeservice.test2pay.com:31013")
	VerifySignFacade verifySignFacade;

	@Test
	public void verifySign() {

		VerifySignRequest request =new VerifySignRequest();
		request.setApiType("VS");
		request.setAsync(true);
		request.setCallbackType("page");
		request.setChannelCode("CS107");
		request.setInstOrderNo("T192022112800010511");
		request.setRequestNo("8ac6648aa7224b6c94366e3c07fda83d");
		Map<String,String> verifyParam =new HashMap<>();
		verifyParam.put("Response","");
		verifyParam.put("MD","ezbUuUa15x4bMoDmdNt1");
		verifyParam.put("TransactionId","ezbUuUa15x4bMoDmdNt1");
		request.setVerifyParam(verifyParam);
		VerifySignResult result = verifySignFacade.verify(request);
		System.out.println(result);

	}



}
