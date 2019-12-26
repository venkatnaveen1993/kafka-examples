package com.poc.xml.to.json.converter;

import com.poc.xml.to.json.converter.model.schema.ASN;
import com.poc.xml.to.json.converter.model.schema.TXML;
import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class XMLToJSONConverter {

    private static final Logger logger = LoggerFactory.getLogger(XMLToJSONConverter.class);

    public static void main(String[] args)  throws Exception{

        try {

            String xmlAsString = Files
                    .lines(Paths.get("src/main/resources/DOM2012.xml"))
                    .collect(Collectors.joining("\n"));
            logger.info("Json as String : {}",convertXMLToJson(xmlAsString));
            //

        } catch (IOException e) {
            logger.error("Failed to convert XML to Object due to the exception : {} ", e);
        }
    }

//    public static String convertXMLToJson1(String xmlAsString)  {
//        TemplateManager templateManager =new TemplateManager();
//        String outputJsonAsString = null;
//        try {
//
//
//            TXML tXML = convertXMLToObject(xmlAsString);
//            String json = templateManager.processTemplate("xml2json", tXML);
//
//            // logger.info("Converted Object is : {}",tXML);
//            outputJsonAsString = convertObjectToJsonString(template, tXML);
//
//        } catch(Exception exception){
//
//            logger.error("Failed to convert XML to Object due to the exception : {} ", exception);
//            return "Goto hell"+exception.getMessage();
//        }
//        return outputJsonAsString;
//    }

    public static String convertXMLToJson(String xmlAsString)  {

        String outputJsonAsString = null;
        try {

            Template template = getTemplate();

            TXML tXML = convertXMLToObject(xmlAsString);

           // logger.info("Converted Object is : {}",tXML);
            outputJsonAsString = convertObjectToJsonString(template, tXML);

        } catch(Exception exception){

            logger.error("Failed to convert XML to Object due to the exception : {} ", exception);
            return "Goto hell"+exception.getMessage();
        }
        return outputJsonAsString;
    }

    private static String convertObjectToJsonString(Template template, TXML tXML) throws TemplateException, IOException {
        ASN asn = tXML.getMessage().getAsn();
        Map<String, ASN> model = new HashMap();
        model.put("shipment", asn);

        StringWriter stringWriter = new StringWriter();
        template.process(model, stringWriter);
        String jsonAsString = stringWriter.toString();
        //logger.info("Generated JSON is : {}",jsonAsString);
        return jsonAsString;
    }

    private static TXML convertXMLToObject(String xmlAsString) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(TXML.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        StringReader reader = new StringReader(xmlAsString);
        return (TXML) jaxbUnmarshaller.unmarshal(reader);
    }

    private static Template getTemplate() throws IOException {
        Configuration cfg = new Configuration();
        cfg.setDefaultEncoding("UTF-8");
        FileTemplateLoader fileTemplateLoader = new FileTemplateLoader(new File("/tmp/templates"));
        cfg.setTemplateLoader(fileTemplateLoader);
        return cfg.getTemplate("shipments.ftl");
    }


}
