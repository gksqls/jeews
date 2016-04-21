package org.gksqls.jeews.support.common.wechat;

import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class XmlSupport {
	
	public static XStream xstream = new XStream(new XppDriver() {  
	    public HierarchicalStreamWriter createWriter(Writer out) {  
	        return new PrettyPrintWriter(out) {  
	            boolean cdata = true;  
	            @SuppressWarnings("rawtypes")
				public void startNode(String name, Class clazz) {  
	                super.startNode(name, clazz);  
	            }  
	            protected void writeText(QuickWriter writer, String text) {  
	                if (cdata) {  
	                    writer.write("<![CDATA[");  
	                    writer.write(text);  
	                    writer.write("]]>");  
	                } else {  
	                    writer.write(text);  
	                }  
	            }  
	        };  
	    }  
	});
	
	@SuppressWarnings("unchecked")  
	public static Map<String, String> parseXml(HttpServletRequest request) throws Exception {  
	    Map<String, String> map = new HashMap<String, String>();  
	    InputStream inputStream = request.getInputStream();  
	    SAXReader reader = new SAXReader();  
	    Document document = reader.read(inputStream);  
	    Element root = document.getRootElement();  
	    List<Element> elementList = root.elements();  
	    for (Element e : elementList) {
	    	map.put(e.getName(), e.getText());  
	    }
	    inputStream.close();  
	    inputStream = null;  
	    return map;  
	} 
	
}
