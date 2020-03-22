package ensa.tpaop.loggerAOP;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.weaver.ast.Instanceof;

import ensa.tpaop.model.*;

public class Loggs {
	Logger logger=Logger.getLogger("conslog.file");
	
	
	public Loggs() {
	}

	public void logaroundDebmethode(ProceedingJoinPoint pjp) throws Throwable
	{
		String msg="";
		long debut=System.currentTimeMillis();
	    Client cl=(Client) pjp.getTarget();
	    String operation=pjp.getSignature().getName();
	    double mt=(Double) pjp.getArgs()[0];
	    if(mt>cl.getCp().getSolde())
	    	msg="Solde Insuffisant";
	    else
	    {
		    pjp.proceed();
		    debut=System.currentTimeMillis()-debut;
		    msg=cl.getNom()+" |"+"Montant : "+mt+" | Operation : "+operation+" | Nouveau Solde : "+cl.getCp().getSolde() +" | Temps d'execution : "+debut+"ms";
	    }
	    logger.info(msg);
	}
	
	public void logaroundAppmethode(ProceedingJoinPoint pjp) throws Throwable
	{
		String msg="";
		long debut=System.currentTimeMillis();
	    Client cl=(Client) pjp.getTarget();
	    String operation=pjp.getSignature().getName();
	    double mt=(Double) pjp.getArgs()[0];
	    if(mt>cl.getCp().getSolde())
	    	msg="Solde Insuffisant";
	    else
	    {
		    pjp.proceed();
		    debut=System.currentTimeMillis()-debut;
		    msg=cl.getNom()+" |"+"Montant : "+mt+" | Operation : "+operation+" | Nouveau Solde : "+cl.getCp().getSolde() +" | Temps d'execution : "+debut+"ms";
	    }
	    logger.info(msg);

	}
}
