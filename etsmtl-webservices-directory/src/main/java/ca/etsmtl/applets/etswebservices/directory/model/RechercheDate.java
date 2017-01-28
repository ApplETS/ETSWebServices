package ca.etsmtl.applets.etswebservices.directory.model;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.1.8
//
// Created by Quasar Development at 28/01/2017
//
//---------------------------------------------------


import org.ksoap2.serialization.AttributeContainer;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

import ca.etsmtl.applets.etswebservices.directory.soap.ExtendedSoapSerializationEnvelope;


public class RechercheDate extends AttributeContainer implements KvmSerializable
{

    
    public String FiltreNom;
    
    public String FiltrePrenom;
    
    public String FiltreServiceCode;

    public RechercheDate ()
    {
    }

    public RechercheDate (Object paramObj,ExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                Object obj = info.getValue();
                if (info.name.equals("FiltreNom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.FiltreNom = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.FiltreNom = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("FiltrePrenom"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.FiltrePrenom = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.FiltrePrenom = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("FiltreServiceCode"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.FiltreServiceCode = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.FiltreServiceCode = (String)obj;
                        }
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.FiltreNom!=null?this.FiltreNom:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.FiltrePrenom!=null?this.FiltrePrenom:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.FiltreServiceCode!=null?this.FiltreServiceCode:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 3;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "FiltreNom";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "FiltrePrenom";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "FiltreServiceCode";
            info.namespace= "http://etsmtl.ca/";
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1)
    {
    }

    
}

