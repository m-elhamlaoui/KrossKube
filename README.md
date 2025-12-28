> Last Updated: October 18th, 2025

# KrossKube

A Model-Driven Engineering (MDE) solution to generate high-level Custom Resource Definitions (CRDs) for standardized, multi-cluster management of base Kubernetes-native resources.

---

KrossKube provides a declarative approach to managing Kubernetes resources across multiple clusters through:

- **Model-Driven CRD Generation**: Automatically generate CRDs from high-level models
- **Multi-Cluster Orchestration**: Standardized resource management across different Kubernetes clusters
- **Resource Abstraction**: High-level abstractions over the native Kubernetes resources
- **Policy-Driven Deployment**: Consistent deployment patterns

<div align="center">

![KrossKube Logo](./assets/KrossKube-Logo.png)

*Figure: The KrossKube logo*

</div>

## Table of Contents

### [Section I: Foundation & Architecture](#i-foundation--architecture)

1. [Overview](#1-overview)
    - [1.1 Problem Statement](#11-problem-statement)
    - [1.2 Solution Approach](#12-solution-approach)

2. [Architecture](#2-architecture)
    - [2.1 Metamodel Layer](#21-metamodel-layer)
    - [2.2 Model Layer](#22-model-layer)
    - [2.3 Object Constraint Language (OCL)](#23-object-constaint-language-ocl)
    - [2.4 Code Generation Layer](#24-code-generation-layer)

3. [Metamodel](#3-metamodel)
    - [3.1 Core Concepts](#31-core-concepts)
        - [3.1.1 Abstract Base Classes](#311-abstract-base-classes)
        - [3.1.2 Resource Hierarchy](#312-resource-hierarchy)
        - [3.1.3 Constraint System](#313-constraint-system)
    - [3.2 Resource Types](#32-resource-types)
        - [3.2.1 Workload Resources](#321-workload-resources)
        - [3.2.2 Network Resources](#322-network-resources)
        - [3.2.3 Storage Resources](#323-storage-resources)
        - [3.2.4 Security Resources](#324-security-resources)

### [Section II: Custom Resources & Multi-Cluster Entities](#ii-custom-resources--multi-cluster-entities)

4. [Custom Resources](#4-custom-resources)
    - [4.1 MultiClusterWorkload](#41-multiclusterworkload)
        - [4.1.1 MultiClusterPod](#411-multiclusterpod)
        - [4.1.2 MultiClusterDeployment](#412-multiclusterdeployment)
        - [4.1.3 MultiClusterStatefulSet](#413-multiclusterstatefulset)
        - [4.1.4 MultiClusterDaemonSet](#414-multiclusterdaemonset)
        - [4.1.5 MultiClusterCronJob](#415-multiclustercronjob)
    - [4.2 MultiClusterNetwork](#42-multiclusternetwork)
        - [4.2.1 MultiClusterService](#421-multiclusterservice)
        - [4.2.2 MultiClusterIngress](#422-multiclusteringress)
    - [4.3 MultiClusterStorage](#43-multiclusterstorage)
        - [4.3.1 MultiClusterPersistentVolume](#431-multiclusterpersistentvolume)
        - [4.3.2 MultiClusterPersistentVolumeClaim](#432-multiclusterpersistentvolumeclaim)
    - [4.4 MultiClusterSecurity](#44-multiclustersecurity)
        - [4.4.1 MultiClusterRole](#441-multiclusterrole)
        - [4.4.2 MultiClusterRoleBinding](#442-multiclusterrolebinding)
        - [4.4.3 MultiClusterSecret](#443-multiclustersecret)
        - [4.4.4 MultiClusterConfigMap](#444-multiclusterconfigmap)

### [Section III: Implementation & Deployment](#iii-implementation--deployment)

5. [Code Generation](#5-code-generation)
    - [5.1 Generation Strategy](#51-generation-strategy)
        - [5.1.1 Template-Based Generation](#511-template-based-generation)
        - [5.1.2 Model-to-Model Transformations](#512-model-to-model-transformations)
        - [5.1.3 Validation and Verification](#513-validation-and-verification)
    - [5.2 Target Artifacts](#52-target-artifacts)
        - [5.2.1 Custom Resource Definitions](#521-custom-resource-definitions)

### [Section IV: Usage & Reference](#iv-usage--reference)

6. [Examples](#6-examples)
    - [6.1 Basic Examples](#61-basic-examples)
        - [6.1.1 Simple Multi-Cluster Pod](#611-simple-multi-cluster-pod)
        - [6.1.2 Load-Balanced Service](#612-load-balanced-service)
        - [6.1.3 Stateful Application](#613-stateful-application)
    - [6.2 Advanced Examples](#62-advanced-examples)
        - [6.2.1 Multi-Region Web Application](#621-multi-region-web-application)
        - [6.2.2 Database Cluster with Replication](#622-database-cluster-with-replication)

7. [Acknowledgments](#7-acknowledgments)

---
---

## 1. Overview

### 1.1 Problem Statement

Managing Kubernetes resources across multiple clusters presents significant operational challenges. Organizations typically face fragmented deployment patterns, inconsistent resource definitions, and complex orchestration workflows when operating distributed Kubernetes environments. Traditional approaches require manual synchronization of resource manifests across clusters, leading to configuration drift and operational overhead.

The absence of standardized abstractions for multi-cluster resource management forces teams to maintain cluster-specific configurations, implement custom orchestration logic, and develop ad-hoc solutions for cross-cluster coordination. This results in increased complexity, reduced reliability, and limited scalability as the number of managed clusters grows.

### 1.2 Solution Approach

`KrossKube` addresses these challenges through a **Model-Driven Engineering** approach that establishes formal abstractions for multi-cluster Kubernetes resource management. The solution introduces a *metamodel-based framework* for defining MultiCluster resources that encapsulate deployment policies, cluster targeting strategies, and resource specifications within unified abstractions.

The core innovation lies in <ins>transforming</ins> **high-level MultiCluster resource models** into standard <ins>**Kubernetes Custom Resource Definitions**</ins> through automated code generation. This approach enables declarative specification of multi-cluster deployment intent while maintaining compatibility with existing Kubernetes tooling and workflows.

By leveraging metamodeling principles, KrossKube provides type-safe abstractions that capture the essential characteristics of multi-cluster resource management: placement policies, cluster selection criteria, and resource lifecycle coordination. The generated CRDs serve as standardized interfaces for multi-cluster operations, enabling consistent resource management across heterogeneous Kubernetes environments.

## 2. Architecture

KrossKube's Model-Driven Engineering foundation establishes the theoretical and practical framework for systematic transformation of abstract resource models into concrete Kubernetes implementations. This foundation encompasses metamodel definition, model specification, constraint validation, and automated code generation processes.

### 2.1 Metamodel Layer

<div align="center">

![KrossKube Metamodel](./assets/KrossKube_metamodel.png)

*Figure: The KrossKube Metamodel UML Class Diagram*

</div>

The metamodel layer defines the abstract syntax and semantic rules for MultiCluster resource specifications. At its core, the `MultiClusterResource` abstract class establishes the foundational interface for all multi-cluster abstractions, providing common attributes for cluster selection and placement policy definition.

Specialized abstract classes extend this foundation to address specific resource categories. `MultiClusterWorkload` introduces workload-specific concerns including replica management and pod template specifications. `MultiClusterNetwork` focuses on service discovery and traffic routing abstractions. `MultiClusterStorage` addresses persistent storage concerns across cluster boundaries. `MultiClusterSecurity` encapsulates authentication, authorization, and secret management patterns.

The metamodel employs composition patterns to separate orthogonal concerns. The `ClusterSelector` class provides flexible cluster targeting through label-based selection and expression matching. The `PlacementPolicy` enumeration defines standardized strategies for resource distribution: `REPLICATED` for identical deployment across all selected clusters, `DISTRIBUTED` for partitioned resource allocation, and `BALANCED` for load-aware placement decisions.

Concrete MultiCluster classes inherit from their respective abstract parents, establishing one-to-one mappings with underlying Kubernetes resource types. `MultiClusterDeployment` extends `MultiClusterWorkload` to provide deployment-specific abstractions, while `MultiClusterService` extends `MultiClusterNetwork` for service management patterns. This inheritance hierarchy ensures type safety while enabling specialized behavior for each resource category.

The metamodel maintains clear separation between abstract resource definitions and their concrete Kubernetes counterparts. Generation relationships, represented through dependency mappings, establish the transformation pathways from MultiCluster abstractions to standard Kubernetes resources. These relationships enable the code generation layer to produce appropriate CRD specifications while preserving the semantic intent of the original models.