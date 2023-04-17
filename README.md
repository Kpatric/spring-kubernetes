# spring-kubernetes
This app  features of Kubernetes, how Kubernetes works, the architecture of Kubernetes, different components and resources of Kubernetes, best practices, and how to deploy applications to Kubernetes.

minikube start --driver=docker  ----start minikube

minikube status  --- check minikube status

kubectl cluster-info --get cluster information

kubectl get node ---get available nodes

minikube docker-env --access docker enviroment

kubectl get deployments --get deployments

kubectl describe deployment depo   -- get deployment information/metadata

kubectl logs podname --get pod logs

kubectl expose deployment deploymentname --type=NodePort  --access service externally

kubectl get service  

kubectl port-forward service/spring-boot-k8s  7080:8080

kubectl delete service  servicename

kubectl delete deployment deploymentname

kubectl apply -f k8s-deployment.yml

minikube service spring-kubernetes-service  --url

kubectl exec -it postgres-deployment-75d87b466b-s4dkw -- /bin/bash
