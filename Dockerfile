FROM java:8
COPY . /var/www/java
WORKDIR /var/www/java
RUN javac armstrong.java
CMD ["java","armstrong"]
RUN echo 'armstrong Image Build is Done.'
