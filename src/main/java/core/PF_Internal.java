package core;

import java.io.IOException;
import java.util.Properties;

public class PF_Internal {
       Properties p = new Properties();
       String getPropertyIn(String prop_file, String property) throws IOException {
              p.load(ClassLoader.getSystemResourceAsStream(prop_file));
              return p.getProperty(property);} //return "property" value
       
public static void main(String[] args) throws IOException {
  String pf_in = "in.properties";
  if (!pf_in.contains(".properties")) {System.err.println("Must be an properties file");System.exit(1); } //extension properties file handling
  PF_Internal p = new PF_Internal();

  System.out.println("Title: \t\t\t\t" +    p.getPropertyIn(pf_in, "title"));
  System.out.println("First Name: \t\t\t" + p.getPropertyIn(pf_in, "first_name"));
  System.out.println("Last Name: \t\t\t" +  p.getPropertyIn(pf_in, "last_name"));
  System.out.println("Current directory: \t\t" + System.getProperty("user.dir"));
  System.out.println("Properties file location: \t" + new java.io.File(pf_in).getCanonicalPath());
}}
