Requirements:

* Docker
* Kubernetes
* Minikube

To connect minikube to local docker image repo:
(PowerShell):
& minikube -p minikube docker-env --shell powershell | Invoke-Expression
(Unix):
eval $(minikube docker-env)
