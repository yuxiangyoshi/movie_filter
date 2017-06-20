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
public class XmljsonStudents {
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING =
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
"<students>\n" +
"	<student>\n" +
"		<SSN>111-00-1111</SSN>\n" +
"		<name>Rylan</name>\n" +
"		<DOB>1-Apr-68</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Both</type>\n" +
"		<phone>213-740-1111</phone>\n" +
"		<phone>213-740-1112</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-00-2222</SSN>\n" +
"		<name>Joshua</name>\n" +
"		<DOB>1-Apr-70</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Both</type>\n" +
"		<phone>213-740-2222</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-00-3333</SSN>\n" +
"		<name>Allen</name>\n" +
"		<DOB>1-Apr-69</DOB>\n" +
"		<gender>F</gender>\n" +
"		<type>Both</type>\n" +
"		<phone>213-740-3333</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-00-4444</SSN>\n" +
"		<name>Aidan</name>\n" +
"		<DOB>1-Apr-85</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Both</type>\n" +
"		<phone>213-740-4444</phone>\n" +
"		<phone>213-740-4445</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-00-5555</SSN>\n" +
"		<name>Aiden</name>\n" +
"		<DOB>1-Apr-82</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Both</type>\n" +
"		<phone>213-740-5555</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-00-6666</SSN>\n" +
"		<name>Barak</name>\n" +
"		<DOB>1-Apr-79</DOB>\n" +
"		<gender>F</gender>\n" +
"		<type>Master</type>\n" +
"		<phone>213-740-6666</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-00-7777</SSN>\n" +
"		<name>Basil</name>\n" +
"		<DOB>1-Apr-78</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Master</type>\n" +
"		<phone>213-740-7777</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-00-8888</SSN>\n" +
"		<name>Cayden</name>\n" +
"		<DOB>1-Apr-75</DOB>\n" +
"		<gender>F</gender>\n" +
"		<type>Master</type>\n" +
"		<phone>213-740-8888</phone>\n" +
"		<phone>213-740-8889</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-00-9999</SSN>\n" +
"		<name>Brendon</name>\n" +
"		<DOB>1-Apr-72</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Master</type>\n" +
"		<phone>213-740-9999</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-00-0000</SSN>\n" +
"		<name>Nate</name>\n" +
"		<DOB>1-Apr-73</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Master</type>\n" +
"		<phone>213-740-0000</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-11-1111</SSN>\n" +
"		<name>Hannah</name>\n" +
"		<DOB>1-Apr-65</DOB>\n" +
"		<gender>F</gender>\n" +
"		<type>Master</type>\n" +
"		<phone>213-741-1111</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-11-2222</SSN>\n" +
"		<name>Zoe</name>\n" +
"		<DOB>1-Apr-62</DOB>\n" +
"		<gender>F</gender>\n" +
"		<type>Master</type>\n" +
"		<phone>213-741-2222</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-11-3333</SSN>\n" +
"		<name>Alexis</name>\n" +
"		<DOB>1-Apr-63</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Phd</type>\n" +
"		<phone>213-741-3333</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-11-4444</SSN>\n" +
"		<name>Madison</name>\n" +
"		<DOB>1-Apr-75</DOB>\n" +
"		<gender>F</gender>\n" +
"		<type>Phd</type>\n" +
"		<phone>213-741-4444</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-11-5555</SSN>\n" +
"		<name>Adalgisa</name>\n" +
"		<DOB>1-Apr-76</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Phd</type>\n" +
"		<phone>213-741-5555</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-11-6666</SSN>\n" +
"		<name>Cora</name>\n" +
"		<DOB>1-Apr-77</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Phd</type>\n" +
"		<phone>213-741-6666</phone>\n" +
"		<phone>213-741-6667</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-11-7777</SSN>\n" +
"		<name>Adalia</name>\n" +
"		<DOB>1-Apr-82</DOB>\n" +
"		<gender>F</gender>\n" +
"		<type>Phd</type>\n" +
"		<phone>213-741-7777</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-11-8888</SSN>\n" +
"		<name>Ava</name>\n" +
"		<DOB>1-Apr-83</DOB>\n" +
"		<gender>F</gender>\n" +
"		<type>Phd</type>\n" +
"		<phone>213-741-8888</phone>\n" +
"		<phone>213-741-8889</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-11-9999</SSN>\n" +
"		<name>Celia</name>\n" +
"		<DOB>1-Apr-86</DOB>\n" +
"		<gender>M</gender>\n" +
"		<type>Phd</type>\n" +
"		<phone>213-741-9999</phone>\n" +
"	</student>\n" +
"	<student>\n" +
"		<SSN>111-11-0000</SSN>\n" +
"		<name>Zaida</name>\n" +
"		<DOB>1-Apr-83</DOB>\n" +
"		<gender>F</gender>\n" +
"		<type>Phd</type>\n" +
"		<phone>213-741-0000</phone>\n" +
"	</student>\n" +
"</students>\n";

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
