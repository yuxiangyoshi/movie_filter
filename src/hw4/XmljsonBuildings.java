/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;
import org.json.JSONObject;
import org.json.XML;

/**
 *
 * @author yuxia
 */
public class XmljsonBuildings {
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING =
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
"<buildings>\n" +
"	<building>\n" +
"		<code>KOH</code>\n" +
"		<buildingName>King Olympic Hall</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.024547</latitude>\n" +
"			<longitude>-118.288</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>1027</streetNo>\n" +
"			<strName>W 34th St</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90007</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>CFX</code>\n" +
"		<buildingName>Cromwell Field</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.021631</latitude>\n" +
"			<longitude>-118.289</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>1026</streetNo>\n" +
"			<strName>W 34th St</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>JEP</code>\n" +
"		<buildingName>JEP House</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.022947</latitude>\n" +
"			<longitude>-118.284</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>801</streetNo>\n" +
"			<strName>W 34th St</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>SHC</code>\n" +
"		<buildingName>Student Health Center</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.023303</latitude>\n" +
"			<longitude>-118.285</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>849</streetNo>\n" +
"			<strName>W 34th St</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>LVY</code>\n" +
"		<buildingName>Leavey Library</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.021595</latitude>\n" +
"			<longitude>-118.282</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>651</streetNo>\n" +
"			<strName>W 35th St</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>VKC</code>\n" +
"		<buildingName>Von KleinSmid Center</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.021649</latitude>\n" +
"			<longitude>-118.284</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>3518</streetNo>\n" +
"			<strName>Trousdale</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>WPH</code>\n" +
"		<buildingName>Waite Phillips Hall</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.022289</latitude>\n" +
"			<longitude>-118.284</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>3550</streetNo>\n" +
"			<strName>Trousdale</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>JHH</code>\n" +
"		<buildingName>John Hubbard Hall</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.020101</latitude>\n" +
"			<longitude>-118.284</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>615</streetNo>\n" +
"			<strName>ChildsWay</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>REG</code>\n" +
"		<buildingName>Registration Builing</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.019603</latitude>\n" +
"			<longitude>-118.282</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>611</streetNo>\n" +
"			<strName>ChildsWay</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>STU</code>\n" +
"		<buildingName>Student Union</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.020226</latitude>\n" +
"			<longitude>-118.286</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>3551</streetNo>\n" +
"			<strName>Trousdale</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>BKS</code>\n" +
"		<buildingName>Bookstore</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.020635</latitude>\n" +
"			<longitude>-118.286</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>840</streetNo>\n" +
"			<strName>ChildsWay</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>RTH</code>\n" +
"		<buildingName>Ronald Tutor Hall</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.020137</latitude>\n" +
"			<longitude>-118.29</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>3710</streetNo>\n" +
"			<strName>McClintock</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>SAL</code>\n" +
"		<buildingName>Salvatori Com. Center</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.01955</latitude>\n" +
"			<longitude>-118.289</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>941</streetNo>\n" +
"			<strName>W 37th Place</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>EEB</code>\n" +
"		<buildingName>Electrical Engr Center</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.019728</latitude>\n" +
"			<longitude>-118.29</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>3715</streetNo>\n" +
"			<strName>McClintock</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"	<building>\n" +
"		<code>OHE</code>\n" +
"		<buildingName>Olin Hall Engineering</buildingName>\n" +
"		<position>\n" +
"			<latitude>34.020493</latitude>\n" +
"			<longitude>-118.29</longitude>\n" +
"		</position>\n" +
"		<address>\n" +
"			<streetNo>3650</streetNo>\n" +
"			<strName>McClintock</strName>\n" +
"			<city>Los Angeles</city>\n" +
"			<state>CA</state>\n" +
"			<zip>90089</zip>\n" +
"		</address>\n" +
"	</building>\n" +
"</buildings>";

    public static void main(String[] args) {
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(TEST_XML_STRING);
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (Exception je) {
            System.out.println(je.toString());
        }
    }
}
