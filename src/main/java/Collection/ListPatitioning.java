package Collection;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

public class ListPatitioning {

	public static void main(String[] args) {
		List<String> productids= new ArrayList<>();
		
		
		productids.add("MSN2W6AOYIBNPL");
		productids.add("MSN2R98LUIF0K1");
		productids.add("MSN2RCTHQ3FIZR");
		productids.add("MSN75DQPE84O92");
		productids.add("MSN2QNYY74VHT9");
		productids.add("MSN2QKE2CD1B41");
		productids.add("MSN2R961YYK60R");
		productids.add("MSNIOWDYQV4");
		productids.add("MSN2R5MG1FAVOX");
		productids.add("MSN2QRDGEA0FZ3");
		productids.add("MSN2VOLX7QPFUR");
		productids.add("MSN377HBQ3QCIB");
		productids.add("MSN2W9ZEOHIWHL");
		productids.add("MSN2RCODYIFZD3");
		productids.add("MSN2QV5ZWV3XAX");
		productids.add("MSN2W9ZEOMVWTL");
		productids.add("MSN2W6EISK0F01");
		productids.add("MSN2VVNV67V1BR");
		productids.add("MSNM45743GPQ5J");
		productids.add("MSN2W6KWHKQ00L");
		productids.add("MSN2QRIK5HAWVX");
		productids.add("MSNJZINYQV4");
		productids.add("MSN2QNSKIKU6DF");
		productids.add("MSN2VVWSQE501L");
		productids.add("MSN2W2R30ZNTT9");
		productids.add("MSN2RCPNWJ0CA9");
		productids.add("MSN2W6AOYPGVQF");
		productids.add("MSN2QRL41QRIAJ");
		productids.add("MSNI10QPQV4");
		productids.add("MSN2QV0W5UD7CD");
		productids.add("MSN2QO08548UXL");
		productids.add("MSN2QUX2BHD2XR");
		productids.add("MSNO5WNX8E0Q51");
		productids.add("MSNIVSIPRR3");
		productids.add("MSN2QGX09GAM7P");
		productids.add("MSN2QYKI2MTXV9");
		productids.add("MSN2QV3G1DMQ3X");
		productids.add("MSN2VOTKURDO6P");
		productids.add("MSNJ84PT8M0S");
		productids.add("MSN2QO2S13L329");
		productids.add("MSN2VS830S16QX");
		productids.add("MSN457MXRPO19J");
		productids.add("MSN2QV2635X891");
		productids.add("MSN2QRNNWSRGJ3");
		productids.add("MSN2W6D8UHNV1X");
		productids.add("MSN2QGUGEEAPIF");
		productids.add("MSNJ8NPQ8Z3W");
		productids.add("MSN2R961Z3X393");
		productids.add("MSN39674UNVAN5");
		productids.add("MSN2VE1NAVC5LL");
		
		List<List<String>> categorySubList = Lists.partition(productids, productids.size() / 10 + 1);
		
		for(List<String> listofproduct:categorySubList )
			System.out.println(listofproduct.size());
	}
}
