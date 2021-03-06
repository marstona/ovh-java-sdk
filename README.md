<img src="https://api.ovh.com/images/ovh-under-construction.png" alt="OVH logo" height="100" align="left"/>

# Ovh-java-sdk
[![Build Status](https://travis-ci.org/UrielCh/ovh-java-sdk.svg?branch=master)](https://travis-ci.org/UrielCh/ovh-java-sdk)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.minidev/ovh-java-sdk/badge.svg?style=flat-square)](https://maven-badges.herokuapp.com/maven-central/net.minidev/ovh-java-sdk/)



## Project on-hold

Since every change from OVH API can break any existing code using this api, I prefert to give up this java wrapper.
I have switch to typescript I'm converting all my existing code to use [api-ovh-node](https://github.com/UrielCh/api-ovh-node)

A lot's of sample code are [available here](https://github.com/UrielCh/api-ovh-node/tree/master/samples)

With this new api far is way more easy to read.


-----

## usage

The complete java SDK for OVH services.

Each service had his own java SDK. you can use each service independently:
    
	<dependency>
		<groupId>net.minidev</groupId>
		<artifactId>ovh-java-sdk-domain</artifactId>
		<version>1.0.17</version>
	</dependency>
	<dependency>
		<groupId>net.minidev</groupId>
		<artifactId>ovh-java-sdk-order</artifactId>
		<version>1.0.17</version>
	</dependency>

Or you can load them all with a single dependency:

	<dependency>
		<groupId>net.minidev</groupId>
		<artifactId>ovh-java-sdk</artifactId>
		<version>1.0.17</version>
	</dependency>

But it's not recomended, excepted if you use them all.

# Usage sample

## Using the all in one SDK:

List all your domain with their expiration dates.

    ApiOvh api = ApiOvh.getInstance(nic, password);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    for (String serviceName : api.domain.GET(null)) {
        OvhService service = api.domain.serviceName_serviceInfos_GET(serviceName);
        System.out.printf("%s status:%s expire on:%s\n", serviceName,
	    service.status.toString(), sdf.format(service.expiration));
    }

by default you will get the following error:

    [main] ERROR net.minidev.ovh.core.ApiOvhConfigBasic - No cert directory, can not save consumer_key! please set `consumer_key_storage` variable to a valid directory in your ./ovh.conf, ~/.ovh/config, ~/ovh.conf or /etc/ovh.conf, or in your environ variale OVH_CONSUMER_KEY_STORAGE
    [main] ERROR net.minidev.ovh.core.ApiOvhConfigBasic - no applicationKey, using the defaut one create a key, and set `application_key` and `application_secret` variable in your ./ovh.conf, ~/.ovh/config, ~/ovh.conf or /etc/ovh.conf, or in your environ variales OVH_APPLICATION_KEY and OVH_APPLICATION_SECRET

because you need to configure your ovh access, but it will work.

## Using ApiOvhDomain:

List all your domains with their expiration dates, only using `ovh-java-sdk-domain` dependence.

    ApiOvhCore core = ApiOvhCore.getInstance(nic, password);
    ApiOvhDomain api = new ApiOvhDomain(core);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    for (String serviceName : api.GET(null)) {
        OvhService service = api.serviceName_serviceInfos_GET(serviceName);
        System.out.printf("%s status:%s expire on:%s\n", serviceName,
	    service.status.toString(), sdf.format(service.expiration));
    }

you get the same results.

## Configuration file
The configuration is loaded from the following files in this order:
1. ovh.conf *in the current directory*
2. ~/.ovh/config 
3. ~/ovh.conf
4. /etc/ovh.conf

the configuration file can contain those values:
* `endpoint` entry point if you use a single endpoint
* `application_key` your application key
* `application_secret` your application secret
* `consumer_key` your consumer key (CK) if you are using a single account
* `redirection` the redirection linked to your `application_key`
* `consumer_key_storage` a directory to store your CK in multi account mode.

# Function naming

Java method has the same name that their REST URL, just replace special chars by _ and postfix the result by the uppercased http method example:

    POST /telephony/{billingAccount}/conference/{serviceName}/participants/{id}/mute
    GET  /telephony/{billingAccount}/abbreviatedNumber/{abbreviatedNumber}

will be named:

    billingAccount_conference_serviceName_participants_id_mute_POST(billingAccount, serviceName, id, ...)
    billingAccount_abbreviatedNumber_abbreviatedNumber_GET(billingAccount, abbreviatedNumber)
    
so that you can easily guest all the function names.

 * the namespace are removed form the method name.
 * using the main `ApiOvh` fron `ovh-java-sdk` this called is available through `apiOvh.telephony.billingAccount_abbreviatedNumber_abbreviatedNumber_GET`

# Services:
All services are present excepted `ovh-java-sdk-auth`, that one is embedded in the main `ovh-java-sdk-core` artefact.

# Authentication

You can use:
- a `user`/`password`: in this case the API generates ConsumerKey on demand for TTL_IN_SEC, and renew them if needed. `ApiOvhCore.getInstance("nic", "password", TTL_IN_SEC)`
- a `ConsumerKey`: provided by your code. `ApiOvhCore.getInstance("My__consumer___key")` (available in version 0.9.1)
- a `ConsumerKey`: provided in your configuration, in this case you can only use a single account.
`ApiOvhCore.getInstance()` (available in version 0.9.1)

# About the API:
- This api is the public version of the Api used to manage the biggest OVH customer resources.
- The first version of our API had never been released for the sake of ovh. (We outaged OVH a couple of times with the previous version)
- This api had been built to use multiple accounts in the same time.

# Supported APIs
Try the official API [api Ovh europe](https://eu.api.ovh.com/).

# License
3-Clause BSD

