<%@ include file="/common/taglibs.jsp" %>

<head>
    <title><fmt:message key="userProfile.title"/></title>
</head>

<div class="col-sm-2">
    <h2></h2>
</div>
<div class="col-sm-7">
    <s:form name="userForm" cssClass="well" autocomplete="off">
        <s:hidden key="user.id"/>
        <s:hidden key="user.version"/>
        <input type="hidden" name="from" value="${param.from}"/>


		<div class="row">
            <div class="col-sm-3">
            <br>
       		</div>
        <div class="col-sm-8">
        	<h3><fmt:message key="patient.heading"/></h3>
        </div>
        </div>
          <hr/>

		<div class="row">
		
			<div class="col-sm-2">
        		<br>
        		</div>
        	
            <div class="col-sm-4">
        		<img src="images/biomatrix/<c:out value="${user.firstName}"/>_<c:out value="${patient.bioId}"/>.png" alt="home" height="200" border="0"/>
        	</div>
        	
        	<div class="col-sm-5">
            
             <div class="row">
            	<label class="control-label"><fmt:message key="user.firstName"/></label> : <c:out value="${user.firstName}"/>
             </div>
             <div class="row">
            	<label class="control-label"><fmt:message key="user.lastName"/></label> : <c:out value="${user.lastName}"/>
            </div>
            
             <div class="row">
             <label class="control-label"><fmt:message key="patient.dob"/></label> : <c:out value="${patient.dob}"/>
             </div>
            
             <div class="row">
             <label class="control-label"><fmt:message key="patient.gender"/></label> : <c:out value="${patient.gender}"/>
             </div>
             
             <div class="row">
             <label class="control-label"><fmt:message key="patient.bloodGroup"/></label> : <c:out value="${patient.bloodGroup}"/>
             </div>
            
             <div class="row">
             <label class="control-label"><fmt:message key="patient.healthCardNumber"/></label> : <c:out value="${patient.healthCardNumber}"/>
             </div>
             
             <div class="row">
             <label class="control-label"><fmt:message key="patient.organDonorStatus"/></label> : 
             
             <s:if test="%{#patient.organDonorStatus=='1'}">
				Yes
			</s:if>
			<s:else>
			    No
			</s:else>
             
             </div>
             
             
       		</div>
        	
        </div>
        
        <hr/>
        
         <div class="row">
         <div class="col-sm-12">
        <label class="control-label"><fmt:message key="patient.allergies"/></label> : <c:out value="${patient.allergies}"/>
        </div> 
        </div>
        
        
        <div class="row">    
        <div class="col-sm-12">
        <label class="control-label"><fmt:message key="patient.medicalCondition"/></label> : <c:out value="${patient.medicalCondition}"/>
        </div>
        </div>
        
        <fieldset>
            <legend class="accordion-heading">
                <a data-toggle="collapse" href="#collapse-address"><fmt:message key="user.contact"/></a>
            </legend>
            <div id="collapse-address" class="accordion-body collapse">
				
				<div class="row">
				 <div class="col-sm-6">
					<label class="control-label"><fmt:message key="user.address.address"/></label> : <c:out value="${user.address.address}"/>
 					</div>


					<div class="col-sm-6">
                        <label class="control-label"><fmt:message key="user.address.city"/></label> : <c:out value="${user.address.city}"/>
                    </div>
					</div>

                <div class="row">
                    
                    <div class="col-sm-6">
                        <label class="control-label"><fmt:message key="user.address.province"/></label> : <c:out value="${user.address.province}"/>
                    </div>
                    <div class="col-sm-6">
                        <label class="control-label"><fmt:message key="user.address.postalCode"/></label> : <c:out value="${user.address.postalCode}"/>
                    </div>
                </div>
            <hr/>
            <div class="row">
            <div class="col-sm-6">
            	<label class="control-label"><fmt:message key="patient.emergencyContactName"/></label> : <c:out value="${patient.emergencyContactName}"/>
            </div>
            <div class="col-sm-6">
            	<label class="control-label"><fmt:message key="patient.emergencyContactPhone"/></label> : <c:out value="${patient.emergencyContactPhone}"/>
            </div>
             </div>
             
            <div class="row">
            <div class="col-sm-6">
            	<label class="control-label"><fmt:message key="patient.nextToKin"/></label> : <c:out value="${patient.nextToKin}"/>
            </div>
            <div class="col-sm-6">
            	<label class="control-label"><fmt:message key="patient.nextToKinContactNumber"/></label> : <c:out value="${patient.nextToKinContactNumber}"/>
            </div>
             </div>
            
            <div class="row">
            <div class="col-sm-6">
            	<label class="control-label"><fmt:message key="patient.legalProxies"/></label> : <c:out value="${patient.legalProxies}"/>
            </div>
            <div class="col-sm-6">
            	<label class="control-label"><fmt:message key="patient.legalProxiesContactNumber"/></label> : <c:out value="${patient.legalProxiesContactNumber}"/>
            </div>
            
        </div>
            
            </div>
            
            
            
        </fieldset>
        
        </s:form>
    </div>
