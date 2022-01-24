# Set the base image to Ubuntu
FROM ubuntu:18.04

# Update repository sources list and install gnupg2
RUN apt-get update && apt-get install -y gnupg2 && apt-get install -y curl

# Add the package verification key
RUN apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 7F0CEB10

# Add MongoDB to repository sources list
RUN echo 'deb http://downloads-distro.mongodb.org/repo/ubuntu-upstart dist 10gen' > tee /etc/apt/sources.list.d/mongodb.list

# Update repository source list
RUN apt-get update

# Install MongoDB
RUN apt-get install -y mongodb

# Create the data directory
RUN mkdir -p /data/db

# Create the bin folder to be abble to update easystock DB
RUN mkdir -p /home/bin

# Expose default port
EXPOSE 27017

# Default port to execute the entrypoint
CMD ["--bind_ip_all --port 27017"]

# Set default container command
ENTRYPOINT /usr/bin/mongod --port 27017 --bind_ip_all
