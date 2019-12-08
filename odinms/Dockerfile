FROM debian:buster

COPY jdk-6u45-linux-x64.bin .
RUN sh jdk-6u45-linux-x64.bin

COPY US_export_policy.jar /jdk1.6.0_45/lib/
COPY local_policy.jar /jdk1.6.0_45/lib/
COPY US_export_policy.jar /jdk1.6.0_45/jre/lib/
COPY local_policy.jar /jdk1.6.0_45/jre/lib/
COPY US_export_policy.jar /jdk1.6.0_45/jre/lib/ext/
COPY local_policy.jar /jdk1.6.0_45/jre/lib/ext/
COPY US_export_policy.jar /jdk1.6.0_45/jre/lib/security/
COPY local_policy.jar /jdk1.6.0_45/jre/lib/security/

WORKDIR /odinms

COPY thepack_82 .

EXPOSE 7575
EXPOSE 7576
EXPOSE 7577
EXPOSE 7578
EXPOSE 8484
