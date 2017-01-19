package com.gnut3ll4.signetswebservices.model;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 4.5.8.1
//
// Created by Quasar Development at 06/09/2016
//
//---------------------------------------------------


import com.gnut3ll4.signetswebservices.soap.ExtendedSoapSerializationEnvelope;

import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class HoraireActivite extends AttributeContainer implements KvmSerializable
{

    
    public String sigle;
    
    public String groupe;
    
    public String jour;
    
    public String journee;
    
    public String codeActivite;
    
    public String nomActivite;
    
    public String activitePrincipale;
    
    public String heureDebut;
    
    public String heureFin;
    
    public String local;
    
    public String titreCours;

    public HoraireActivite()
    {
    }

    public HoraireActivite(java.lang.Object paramObj, ExtendedSoapSerializationEnvelope __envelope)
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
                java.lang.Object obj = info.getValue(); 
                if (info.name.equals("sigle"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.sigle = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.sigle = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("groupe"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.groupe = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.groupe = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("jour"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.jour = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.jour = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("journee"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.journee = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.journee = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("codeActivite"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.codeActivite = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.codeActivite = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("nomActivite"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.nomActivite = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.nomActivite = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("activitePrincipale"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.activitePrincipale = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.activitePrincipale = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("heureDebut"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.heureDebut = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.heureDebut = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("heureFin"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.heureFin = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.heureFin = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("local"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.local = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.local = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("titreCours"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.titreCours = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.titreCours = (String)obj;
                        }
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.sigle!=null?this.sigle:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.groupe!=null?this.groupe:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.jour!=null?this.jour:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.journee!=null?this.journee:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.codeActivite!=null?this.codeActivite:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.nomActivite!=null?this.nomActivite:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.activitePrincipale!=null?this.activitePrincipale:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.heureDebut!=null?this.heureDebut:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.heureFin!=null?this.heureFin:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.local!=null?this.local:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.titreCours!=null?this.titreCours:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 11;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "sigle";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "groupe";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "jour";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "journee";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "codeActivite";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "nomActivite";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "activitePrincipale";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "heureDebut";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "heureFin";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "local";
            info.namespace= "http://etsmtl.ca/";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "titreCours";
            info.namespace= "http://etsmtl.ca/";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

}