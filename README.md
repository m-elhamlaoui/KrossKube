> Last Updated: January 4th, 2026

# KrossKube

<div align="center">

![KrossKube Logo](./assets/KrossKube-Logo.png)

_Figure: The KrossKube logo_

</div>

---

<div align="center">

**KrossKube** is a Model-Driven Engineering (MDE) solution designed to address the complexities of managing native Kubernetes resources across <ins>multiple clusters</ins>.

<br/>

[![Kubernetes](https://img.shields.io/badge/Kubernetes-1.24+-326CE5.svg?logo=kubernetes&logoColor=white)](https://kubernetes.io/)
[![Eclipse Modeling](https://img.shields.io/badge/Eclipse-Modeling-4A90E2.svg?logo=eclipse&logoColor=white)](https://www.eclipse.org/modeling/)
[![Xtext](https://img.shields.io/badge/Xtext-DSL-5BA0F2.svg)](https://www.eclipse.org/Xtext/)
[![Ecore](https://img.shields.io/badge/Ecore-Metamodel-6BB6FF.svg)](https://www.eclipse.org/modeling/emf/)
[![Epsilon](https://img.shields.io/badge/Epsilon-Model%20Management-7CC7FF.svg)](https://www.eclipse.org/epsilon/)
[![OCL](https://img.shields.io/badge/OCL-Constraints-2E5BBA.svg)](https://www.eclipse.org/ocl/)

</div>

<br/>

## Team Members<a id="team-members"></a>

<table align="center">
    <tr>
        <td align="center">
            <img src="https://github.com/user-attachments/assets/ce3f09cd-a351-4401-9ace-bbccd85b6f09" width="200" height="200"/>
            <br /><sup>BIDIOUANE <br /> Haitam</sup><br />
            <span><a href="https://github.com/sch0penheimer"><code>@sch0penheimer</code></a></span>
            <br /> <br />
            <a href="https://github.com/sch0penheimer" 
            title="GitHub">
                <img src="https://img.shields.io/badge/-0077B5?style=flat&logo=github&logoColor=white" />
            </a>
            <a href="https://www.linkedin.com/in/haitam-bidiouane/" 
            title="LinkedIn">
                <img src="https://img.shields.io/badge/-blue.svg?logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHNoYXBlLXJlbmRlcmluZz0iZ2VvbWV0cmljUHJlY2lzaW9uIiB0ZXh0LXJlbmRlcmluZz0iZ2VvbWV0cmljUHJlY2lzaW9uIiBpbWFnZS1yZW5kZXJpbmc9Im9wdGltaXplUXVhbGl0eSIgZmlsbC1ydWxlPSJldmVub2RkIiBjbGlwLXJ1bGU9ImV2ZW5vZGQiIHZpZXdCb3g9IjAgMCA1MTIgNTEyIj48cGF0aCBmaWxsPSIjZmZmIiBkPSJNNDc0LjkxOSAwSDM4LjU5MkMxNy43MiAwIDAgMTYuNTA0IDAgMzYuODQxVjQ3NS4xNEMwIDQ5NS40OTYgMTEuNjI5IDUxMiAzMi40OTIgNTEyaDQzNi4zMjdDNDg5LjcxOCA1MTIgNTEyIDQ5NS40OTYgNTEyIDQ3NS4xNFYzNi44NDFDNTEyIDE2LjUwNCA0OTUuODA5IDAgNDc0LjkxOSAwek0xOTUuMDQzIDE5NS4wNDNoNjguOTI4djM1LjEzNmguNzU1YzEwLjUwNS0xOC45NDUgNDEuNTQxLTM4LjE3NyA3OS45MjEtMzguMTc3IDczLjY1NSAwIDk0LjIxNCAzOS4xMDggOTQuMjE0IDExMS41Mzh2MTM1LjMyMWgtNzMuMTQ4VjMxNi44ODNjMC0zMi40MjctMTIuOTQ3LTYwLjg4My00My4yMjctNjAuODgzLTM2Ljc2OCAwLTU0LjI5NSAyNC44ODktNTQuMjk1IDY1Ljc1OHYxMTcuMTAzaC03My4xNDhWMTk1LjA0M3pNNzMuMTM5IDQzOC44NjFoNzMuMTQ4VjE5NS4wNDNINzMuMTM5djI0My44MTh6bTgyLjI4OS0zMjkuMTQ4YzAgMjUuMjU4LTIwLjQ1NyA0NS43MTUtNDUuNzE1IDQ1LjcxNS0yNS4yNTggMC00NS43MTUtMjAuNDU3LTQ1LjcxNS00NS43MTUgMC0yNS4yNTggMjAuNDU3LTQ1LjcxNSA0NS43MTUtNDUuNzE1IDI1LjI1OCAwIDQ1LjcxNSAyMC40NTcgNDUuNzE1IDQ1LjcxNXoiLz48L3N2Zz4=" />
            </a>
        </td>
        <td align="center">
            <img src="https://github.com/user-attachments/assets/c5bd80c6-6007-49eb-bc59-e04b8b14c461" width="200" height="200"/>
            <br /><sup>ELMOUDNI <br />Yassine</sup><br />
            <span><a href="https://github.com/Mdn753"><code>@Mdn753</code></a></span>
            <br /> <br />
            <a href="https://github.com/Mdn753" title="GitHub">                    
                <img src="https://img.shields.io/badge/-0077B5?style=flat&logo=github&logoColor=white" />
            </a>
            <a href="https://www.linkedin.com/in/el-moudni-yassine-064482333/" title="LinkedIn">
                <img src="https://img.shields.io/badge/-blue.svg?logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHNoYXBlLXJlbmRlcmluZz0iZ2VvbWV0cmljUHJlY2lzaW9uIiB0ZXh0LXJlbmRlcmluZz0iZ2VvbWV0cmljUHJlY2lzaW9uIiBpbWFnZS1yZW5kZXJpbmc9Im9wdGltaXplUXVhbGl0eSIgZmlsbC1ydWxlPSJldmVub2RkIiBjbGlwLXJ1bGU9ImV2ZW5vZGQiIHZpZXdCb3g9IjAgMCA1MTIgNTEyIj48cGF0aCBmaWxsPSIjZmZmIiBkPSJNNDc0LjkxOSAwSDM4LjU5MkMxNy43MiAwIDAgMTYuNTA0IDAgMzYuODQxVjQ3NS4xNEMwIDQ5NS40OTYgMTEuNjI5IDUxMiAzMi40OTIgNTEyaDQzNi4zMjdDNDg5LjcxOCA1MTIgNTEyIDQ5NS40OTYgNTEyIDQ3NS4xNFYzNi44NDFDNTEyIDE2LjUwNCA0OTUuODA5IDAgNDc0LjkxOSAwek0xOTUuMDQzIDE5NS4wNDNoNjguOTI4djM1LjEzNmguNzU1YzEwLjUwNS0xOC45NDUgNDEuNTQxLTM4LjE3NyA3OS45MjEtMzguMTc3IDczLjY1NSAwIDk0LjIxNCAzOS4xMDggOTQuMjE0IDExMS41Mzh2MTM1LjMyMWgtNzMuMTQ4VjMxNi44ODNjMC0zMi40MjctMTIuOTQ3LTYwLjg4My00My4yMjctNjAuODgzLTM2Ljc2OCAwLTU0LjI5NSAyNC44ODktNTQuMjk1IDY1Ljc1OHYxMTcuMTAzaC03My4xNDhWMTk1LjA0M3pNNzMuMTM5IDQzOC44NjFoNzMuMTQ4VjE5NS4wNDNINzMuMTM5djI0My44MTh6bTgyLjI4OS0zMjkuMTQ4YzAgMjUuMjU4LTIwLjQ1NyA0NS43MTUtNDUuNzE1IDQ1LjcxNS0yNS4yNTggMC00NS43MTUtMjAuNDU3LTQ1LjcxNS00NS43MTUgMC0yNS4yNTggMjAuNDU3LTQ1LjcxNSA0NS43MTUtNDUuNzE1IDI1LjI1OCAwIDQ1LjcxNSAyMC40NTcgNDUuNzE1IDQ1LjcxNXoiLz48L3N2Zz4=" />
            </a>
        </td>
        <td align="center">
            <img src="https://github.com/user-attachments/assets/840b6a43-cf1e-4df1-af9d-2a9c2f3a3a50" width="200" height="200"/>
            <br /><sup>GHOUZALI <br /> Ayoub</sup>
            <br />
            <span><a href="https://github.com/AyoubGhouzali"><code>@AyoubGhouzali</code></a></span>
            <br /> <br />
            <a href="https://github.com/AyoubGhouzali" title="GitHub">
                <img src="https://img.shields.io/badge/-0077B5?style=flat&logo=github&logoColor=white" />
            </a>
            <a href="https://www.linkedin.com/in/ayoub-ghouzali-976369251/" title="LinkedIn">
                <img src="https://img.shields.io/badge/-blue.svg?logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHNoYXBlLXJlbmRlcmluZz0iZ2VvbWV0cmljUHJlY2lzaW9uIiB0ZXh0LXJlbmRlcmluZz0iZ2VvbWV0cmljUHJlY2lzaW9uIiBpbWFnZS1yZW5kZXJpbmc9Im9wdGltaXplUXVhbGl0eSIgZmlsbC1ydWxlPSJldmVub2RkIiBjbGlwLXJ1bGU9ImV2ZW5vZGQiIHZpZXdCb3g9IjAgMCA1MTIgNTEyIj48cGF0aCBmaWxsPSIjZmZmIiBkPSJNNDc0LjkxOSAwSDM4LjU5MkMxNy43MiAwIDAgMTYuNTA0IDAgMzYuODQxVjQ3NS4xNEMwIDQ5NS40OTYgMTEuNjI5IDUxMiAzMi40OTIgNTEyaDQzNi4zMjdDNDg5LjcxOCA1MTIgNTEyIDQ5NS40OTYgNTEyIDQ3NS4xNFYzNi44NDFDNTEyIDE2LjUwNCA0OTUuODA5IDAgNDc0LjkxOSAwek0xOTUuMDQzIDE5NS4wNDNoNjguOTI4djM1LjEzNmguNzU1YzEwLjUwNS0xOC45NDUgNDEuNTQxLTM4LjE3NyA3OS45MjEtMzguMTc3IDczLjY1NSAwIDk0LjIxNCAzOS4xMDggOTQuMjE0IDExMS41Mzh2MTM1LjMyMWgtNzMuMTQ4VjMxNi44ODNjMC0zMi40MjctMTIuOTQ3LTYwLjg4My00My4yMjctNjAuODgzLTM2Ljc2OCAwLTU0LjI5NSAyNC44ODktNTQuMjk1IDY1Ljc1OHYxMTcuMTAzaC03My4xNDhWMTk1LjA0M3pNNzMuMTM5IDQzOC44NjFoNzMuMTQ4VjE5NS4wNDNINzMuMTM5djI0My44MTh6bTgyLjI4OS0zMjkuMTQ4YzAgMjUuMjU4LTIwLjQ1NyA0NS43MTUtNDUuNzE1IDQ1LjcxNS0yNS4yNTggMC00NS43MTUtMjAuNDU3LTQ1LjcxNS00NS43MTUgMC0yNS4yNTggMjAuNDU3LTQ1LjcxNSA0NS43MTUtNDUuNzE1IDI1LjI1OCAwIDQ1LjcxNSAyMC40NTcgNDUuNzE1IDQ1LjcxNXoiLz48L3N2Zz4=" />
            </a>
        </td>
        <td align="center">
            <img src="https://github.com/user-attachments/assets/51d45fae-8a6c-4a7c-afc7-41d6dfabcf20" width="200" height="200"/>
            <br /><sup>ECHAIB <br /> Ayoub</sup><br />
            <span><a href="https://github.com/Ayoech"><code>@Ayoech</code></a></span>
            <br /> <br />
            <a href="https://github.com/Ayoech" title="GitHub">
                <img src="https://img.shields.io/badge/-0077B5?style=flat&logo=github&logoColor=white" />
            </a>
            <a href="https://www.linkedin.com/in/ayoub-echaib/" title="LinkedIn">
                <img src="https://img.shields.io/badge/-blue.svg?logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHNoYXBlLXJlbmRlcmluZz0iZ2VvbWV0cmljUHJlY2lzaW9uIiB0ZXh0LXJlbmRlcmluZz0iZ2VvbWV0cmljUHJlY2lzaW9uIiBpbWFnZS1yZW5kZXJpbmc9Im9wdGltaXplUXVhbGl0eSIgZmlsbC1ydWxlPSJldmVub2RkIiBjbGlwLXJ1bGU9ImV2ZW5vZGQiIHZpZXdCb3g9IjAgMCA1MTIgNTEyIj48cGF0aCBmaWxsPSIjZmZmIiBkPSJNNDc0LjkxOSAwSDM4LjU5MkMxNy43MiAwIDAgMTYuNTA0IDAgMzYuODQxVjQ3NS4xNEMwIDQ5NS40OTYgMTEuNjI5IDUxMiAzMi40OTIgNTEyaDQzNi4zMjdDNDg5LjcxOCA1MTIgNTEyIDQ5NS40OTYgNTEyIDQ3NS4xNFYzNi44NDFDNTEyIDE2LjUwNCA0OTUuODA5IDAgNDc0LjkxOSAwek0xOTUuMDQzIDE5NS4wNDNoNjguOTI4djM1LjEzNmguNzU1YzEwLjUwNS0xOC45NDUgNDEuNTQxLTM4LjE3NyA3OS45MjEtMzguMTc3IDczLjY1NSAwIDk0LjIxNCAzOS4xMDggOTQuMjE0IDExMS41Mzh2MTM1LjMyMWgtNzMuMTQ4VjMxNi44ODNjMC0zMi40MjctMTIuOTQ3LTYwLjg4My00My4yMjctNjAuODgzLTM2Ljc2OCAwLTU0LjI5NSAyNC44ODktNTQuMjk1IDY1Ljc1OHYxMTcuMTAzaC03My4xNDhWMTk1LjA0M3pNNzMuMTM5IDQzOC44NjFoNzMuMTQ4VjE5NS4wNDNINzMuMTM5djI0My44MTh6bTgyLjI4OS0zMjkuMTQ4YzAgMjUuMjU4LTIwLjQ1NyA0NS43MTUtNDUuNzE1IDQ1LjcxNS0yNS4yNTggMC00NS43MTUtMjAuNDU3LTQ1LjcxNS00NS43MTUgMC0yNS4yNTggMjAuNDU3LTQ1LjcxNSA0NS43MTUtNDUuNzE1IDI1LjI1OCAwIDQ1LjcxNSAyMC40NTcgNDUuNzE1IDQ1LjcxNXoiLz48L3N2Zz4=" />
             </a>
        </td>
    </tr>
</table>

## Table of Contents

### [Section I: Foundation & Architecture](#i-foundation--architecture)

1. [Overview](#1-overview)

   - [1.1 Problem Statement](#11-problem-statement)
   - [1.2 Solution Approach](#12-solution-approach)

2. [Architecture & Metamodel](#2-architecture--metamodel)

   - [2.1 Metamodel Sub-Packages](#21-metamodel-sub-packages)
     - [2.1.1 Kubernetes Native Packages](#211-kubernetes-native-packages)
       - [2.1.1.1 Runtime Resources](#2111-runtime-resources)
       - [2.1.1.2 Network Resources](#2112-network-resources)
       - [2.1.1.3 Storage Resources](#2113-storage-resources)
       - [2.1.1.4 Security Resources](#2114-security-resources)
     - [2.1.2 KrossKube Multicluster Package](#212-krosskube-multicluster-package)

### [Section II: Implementation & Technology Stack](#ii-implementation--technology-stack)

4. [Technology Stack](#4-technology-stack)

   - [4.1 Eclipse Modeling Framework](#41-eclipse-modeling-framework)
     - [4.1.1 Obeo Designer Integration](#411-obeo-designer-integration)
     - [4.1.2 Ecore Metamodeling](#412-ecore-metamodeling)
     - [4.1.3 EMF Code Generation](#413-emf-code-generation)
     - [4.1.4 Object Constraint Language (OCL)](#414-object-constraint-language-ocl)
   - [4.2 Domain-Specific Language](#42-domain-specific-language)
     - [4.2.1 Xtext Grammar Definition](#421-xtext-grammar-definition)
     - [4.2.2 Language Infrastructure](#422-language-infrastructure)
     - [4.2.3 Eclipse IDE Integration](#423-eclipse-ide-integration)
   - [4.3 Model-To-Text Transformation Engine](#43-model-to-text-transformation-engine)
     - [4.3.1 Epsilon Generation Language (EGL)](#431-epsilon-generation-language-egl)

5. [Code Generation](#5-code-generation)
   - [5.1 Generation Strategy](#51-generation-strategy)
     - [5.1.1 Template-Based Generation](#511-template-based-generation)
     - [5.1.2 Model-to-Text Transformations](#512-model-to-text-transformations)
     - [5.1.3 Validation and Verification](#513-validation-and-verification)
   - [5.2 Target Artifacts](#52-target-artifacts)
     - [5.2.1 Custom Resource Definitions](#521-custom-resource-definitions)
     - [5.2.2 Deployment Manifests](#522-deployment-manifests)

### [Section III: Usage & Reference](#iii-usage--reference)

6. [Examples](#6-examples)

   - [6.1 Basic Models Examples](#61-basic-models-examples)
   - [6.2 Advanced Models Examples](#62-advanced-models-examples)

---

7. [End-to-end Practical Walkthrough](#7-walkthrough)

## 1. Overview

### 1.1 Problem Statement

Managing Kubernetes resources across multiple clusters presents significant operational challenges. Organizations typically face fragmented deployment patterns, inconsistent resource definitions, and complex orchestration workflows when operating distributed Kubernetes environments. Traditional multi-cluster management approaches rely on manual synchronization of YAML manifests and custom scripts.

<div align="center">

![K8s Multi-Cluster Management](./assets/2_EKS_clusters.png)

_Figure: Kubernetes Multi-Cluster Management_

</div>

<ins>**KrossKube**</ins> transforms this paradigm by introducing **`high-level abstractions`** that capture the essential characteristics of multi-cluster resource management while automatically generating the necessary Kubernetes Custom Resource Definitions (CRDs).

### 1.2 Solution Approach

<ins>**_KrossKube_**</ins> addresses this paradigm through a **Model-Driven Engineering** approach that establishes **formal & normalized** **`high-level abstractions`** for multi-cluster Kubernetes resource management. The solution introduces a **_metamodel-based framework_** for defining MultiCluster resources that encapsulate deployment policies, cluster targeting strategies, and resource specifications within unified abstractions.

The core innovation lies in <ins>transforming</ins> **high-level MultiCluster resource models** into standard <ins>**Kubernetes Custom Resource Definitions**</ins> through automated `Model-to-Text` YAML code generation. This approach enables declarative specification of multi-cluster deployment intent while maintaining compatibility with existing Kubernetes tooling and workflows.

## 2. Architecture & Metamodel

KrossKube's Model-Driven Engineering foundation establishes the theoretical and practical framework for systematic transformation of abstract resource models into concrete Kubernetes manifests.

### 2.1 Metamodel Layer

<div align="center">

![KrossKube Metamodel](./assets/KrossKube_metamodel.png)

_Figure: The KrossKube Metamodel UML Class Diagram_

</div>

The metamodel layer defines the abstract syntax and semantic rules for MultiCluster resource specifications. At its core, the `MultiClusterResource` abstract class establishes the foundational interface for all multi-cluster abstractions, providing common attributes for cluster selection and placement policy definition.

Specialized abstract classes extend this foundation to address specific resource categories, and concrete MultiCluster classes inherit from their respective abstract parents, establishing one-to-one mappings with underlying Kubernetes resource types.

### 2.1 Metamodel Sub-Packages

The KrossKube metamodel architecture is organized into distinct sub-packages that provide modular separation between native Kubernetes resource definitions and multi-cluster abstractions.

#### 2.1.1 Kubernetes Native Packages

The native Kubernetes packages provide comprehensive modeling support for standard Kubernetes resources, organized by functional domain. These packages establish the foundational abstractions that multi-cluster resources extend and compose.

<div align="center">

![KrossKube MultiCluster Abstractions](./assets/KrossKube_K8s-resources-submetamodel.png)

_Figure: KrossKube's Kubernetes Native Resources Metamodel Package_

</div>

##### 2.1.1.1 Runtime Resources

The `kubernetes.runtime` package defines core workload and execution abstractions including Pod, Deployment, StatefulSet, DaemonSet, and CronJob. These classes capture essential runtime characteristics: container specifications, resource requirements, scheduling constraints, and lifecycle management policies.

##### 2.1.1.2 Network Resources

The `kubernetes.config` package encompasses network-oriented resources including Service and Ingress abstractions. Service definitions specify load balancing policies, endpoint selection criteria, and traffic routing configurations.

##### 2.1.1.3 Storage Resources

The `kubernetes.storage` package provides persistent storage abstractions through PersistentVolume and PersistentVolumeClaim definitions. These classes model storage allocation policies, access modes, capacity specifications, and binding relationships.

##### 2.1.1.4 Security Resources

The `kubernetes.security` package defines authentication and authorization abstractions including Role, RoleBinding, ServiceAccount, and Secret management - implementing basically classic K8s RBAC (Role-Based Access Control) and credential management.

#### 2.1.2 KrossKube Multicluster Package

<div align="center">

![KrossKube MultiCluster Abstractions](./assets/KrossKube_crosscluster_abstractions.png)

_Figure: KrossKube MultiCluster Abstractions Metamodel Package_

</div>

The `krosskube.multicluster` package introduces the high-level abstractions that extend native Kubernetes resources with multi-cluster management capabilities.

---

The package architecture establishes inheritance hierarchies where concrete MultiCluster classes (`MultiClusterDeployment`, `MultiClusterService`, etc.) inherit from categorical abstract classes (`MultiClusterWorkload`, `MultiClusterNetwork`, etc.). This design ensures consistent interface patterns while enabling specialized behavior for different resource types.

The `ClusterSelector` and `PlacementPolicy` components provide reusable cluster targeting and distribution strategies across all MultiCluster resource types.

### 2.2 Object Constraint Language (OCL)

The KrossKube metamodel implements comprehensive OCL constraints enforcing semantic correctness and Kubernetes specification compliance across all model instances:

#### 2.2.1 Naming Conventions & Format Validation

**DNS Compliance**: All resources enforce Kubernetes naming rules:

```ocl
nameValidFormat: name.matches('[a-z0-9]([-a-z0-9]*[a-z0-9])?')
nameMaxLength: name.size() <= 253
nameRequired: not name.oclIsUndefined() and name.size() > 0
```

#### 2.2.2 Resource Template Consistency

**Template Structure Validation**:

```ocl
deploymentTemplateRequired: not deploymentTemplate.oclIsUndefined()
podHasContainers: podTemplate.containers->size() > 0
containerImagesSpecified: podTemplate.containers->forAll(c | not c.dockerImage.oclIsUndefined())
```

#### 2.2.3 Cluster Selection & Placement Validation

**Selector Logic Consistency**:

```ocl
hasMatchCriteria: matchLabels->size() > 0 or matchExpressions->size() > 0
clusterSelectorForDistribution: (placementPolicy = PlacementPolicy::DISTRIBUTED or
    placementPolicy = PlacementPolicy::BALANCED) implies not clusterSelector.oclIsUndefined()
```

#### 2.2.4 Kubernetes Specification Compliance

**Standard Resource Validation**:

```ocl
//-- Storage access modes validation --//
accessModesValid: accessModes->forAll(mode |
    mode.matches('ReadWriteOnce|ReadOnlyMany|ReadWriteMany'))

//-- Secret type validation --//
typeValid: type.matches('Opaque|kubernetes.io/service-account-token|kubernetes.io/dockercfg|kubernetes.io/dockerconfigjson|kubernetes.io/basic-auth|kubernetes.io/ssh-auth|kubernetes.io/tls')

//-- Storage format validation --//
storageFormatValid: storageRequest.matches('[0-9]+(Ei|Pi|Ti|Gi|Mi|Ki)')
```

#### 2.2.5 RBAC & Security Validation

**Policy Completeness**:

```ocl
resourcesOrNonResourceURLsRequired: resources->size() > 0 or nonResourceURLs->size() > 0
verbsNotEmpty: verbs->size() > 0
roleBindingHasRole: not roleBindingTemplate.role.oclIsUndefined()
```

#### 2.2.6 Data Integrity & Cross-Reference Validation

**Configuration & References**:

```ocl
dataNotEmpty: data->size() > 0
dataKeysValid: data->forAll(key | key.matches('[A-Za-z0-9._-]+'))
operatorValid: operator.matches('In|NotIn|Exists|DoesNotExist')
```

The constraint system integrates with Eclipse Modeling Framework validation infrastructure, providing real-time feedback during model development.

> **Check Metamodel Files**

> [/metamodel/*.ecore/](./metamodel)
