package cinder;

import cinder.geom.AttribSet;
import cinder.geom.Source;
import cinder.geom.Target;
import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ptr.IntPtr;
import glm.detail.Mat4;
import glm.detail.Vec2;
import glm.detail.Vec3;
import glm.detail.Vec4;
import std.SharedPtr;

@CxxHeader(value = {"cinder/TriMesh.h"}, useQuotes = false)
@CxxClass("cinder::TriMesh")
public interface TriMesh extends Source {

    @CxxHeader(value = {"cinder/TriMesh.h"}, useQuotes = false)
    @CxxClass("cinder::TriMesh::Format")
    public interface Format extends CxxObject {

        @CxxConstructor
        public static Format newFormat() {
            throw new CxxExpectedGeneratedCodeException();
        }

        @CxxMethod
        @CxxByReference
        public Format positions(@CxxUnsigned byte dims);

        @CxxMethod
        @CxxByReference
        public Format normals();

        @CxxMethod
        @CxxByReference
        public Format tangents();

        @CxxMethod
        @CxxByReference
        public Format bitangents();

        @CxxMethod
        @CxxByReference
        public Format colors(@CxxUnsigned byte dims);

        @CxxMethod
        @CxxByReference
        public Format colors();

        //! Enables and establishes the dimensions of texture coords for unit 0
        @CxxMethod
        @CxxByReference
        public Format texCoords(@CxxUnsigned byte dims);

        //! Enables and establishes the dimensions of texture coords for unit 0
        @CxxMethod
        @CxxByReference
        public Format texCoords0(@CxxUnsigned byte dims);

        //! Enables and establishes the dimensions of texture coords for unit 1
        @CxxMethod
        @CxxByReference
        public Format texCoords1(@CxxUnsigned byte dims);

        //! Enables and establishes the dimensions of texture coords for unit 2
        @CxxMethod
        @CxxByReference
        public Format texCoords2(@CxxUnsigned byte dims);

        //! Enables and establishes the dimensions of texture coords for unit 3
        @CxxMethod
        @CxxByReference
        public Format texCoords3(@CxxUnsigned byte dims);

        @CxxFieldGetter
        @CxxUnsigned
        public byte mPositionsDims();

        @CxxFieldGetter
        @CxxUnsigned
        public byte mNormalsDims();

        @CxxFieldGetter
        @CxxUnsigned
        public byte mTangentsDims();

        @CxxFieldGetter
        @CxxUnsigned
        public byte mBitangentsDims();

        @CxxFieldGetter
        @CxxUnsigned
        public byte mColorsDims();

        @CxxFieldGetter
        @CxxUnsigned
        public byte mTexCoords0Dims();

        @CxxFieldGetter
        @CxxUnsigned
        public byte mTexCoords1Dims();

        @CxxFieldGetter
        @CxxUnsigned
        public byte mTexCoords2Dims();

        @CxxFieldGetter
        @CxxUnsigned
        public byte mTexCoords3Dims();

    }

    @CxxFunction("cinder::TriMesh::create")
    @CxxByValue
    public static SharedPtr<TriMesh> create() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::TriMesh::create")
    @CxxByValue
    public static SharedPtr<TriMesh> create(@CxxConst @CxxByReference Format format) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::TriMesh::create")
    @CxxByValue
    public static SharedPtr<TriMesh> create(@CxxConst @CxxByReference Source source) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxFunction("cinder::TriMesh::create")
    @CxxByValue
    public static SharedPtr<TriMesh> create(@CxxConst @CxxByReference Source source, @CxxConst @CxxByReference Format format) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static TriMesh newTriMesh() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static TriMesh newTriMesh(@CxxConst @CxxByReference Format format) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static TriMesh newTriMesh(@CxxConst @CxxByReference Source source) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxConstructor
    public static TriMesh newTriMesh(@CxxConst @CxxByReference Source source, @CxxConst @CxxByReference Format format) {
        throw new CxxExpectedGeneratedCodeException();
    }

    //! Creates a suitable TriMesh::Format for representing a geom::Source \a source
    @CxxFunction("cinder::TriMesh::formatFromSource")
    @CxxByValue
    public static Format formatFromSource(@CxxConst @CxxByReference Source source) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxMethod(isConst = true)
    public void loadInto(Target target, @CxxConst @CxxByReference AttribSet requestedAttribs);

    @CxxMethod(isConst = true)
    public Source clone();

    @CxxMethod
    public void clear();

    @CxxMethod(isConst = true)
    public boolean hasNormals();

    @CxxMethod(isConst = true)
    public boolean hasTangents();

    @CxxMethod(isConst = true)
    public boolean hasBitangents();

    @CxxMethod(isConst = true)
    public boolean hasColors();

    @CxxMethod(isConst = true)
    public boolean hasColorsRgb();

    @CxxMethod(isConst = true)
    public boolean hasColorsRgba();

    //! Returns whether the TriMesh has texture coordinates for unit 0
    @CxxMethod(isConst = true)
    public boolean hasTexCoords();

    //! Returns whether the TriMesh has texture coordinates for unit 0
    @CxxMethod(isConst = true)
    public boolean hasTexCoords0();

    //! Returns whether the TriMesh has texture coordinates for unit 1
    @CxxMethod(isConst = true)
    public boolean hasTexCoords1();

    //! Returns whether the TriMesh has texture coordinates for unit 2
    @CxxMethod(isConst = true)
    public boolean hasTexCoords2();

    //! Returns whether the TriMesh has texture coordinates for unit 3
    @CxxMethod(isConst = true)
    public boolean hasTexCoords3();

    //! Appends a position which can be referred to with appendTriangle() or appendIndices()
    @CxxMethod
    public void appendPosition(@CxxConst @CxxByReference Vec2 position);

    //! Appends a position which can be referred to with appendTriangle() or appendIndices()
    @CxxMethod
    public void appendPosition(@CxxConst @CxxByReference Vec3 position);

    //! Appends a position which can be referred to with appendTriangle() or appendIndices()
    @CxxMethod
    public void appendPosition(@CxxConst @CxxByReference Vec4 position);

    //! Appends multiple vertices to the TriMesh which can be referred to with appendTriangle() or appendIndices()
    @CxxMethod
    public void appendPositions(@CxxConst Vec2 positions, @NULong long num);

    //! Appends multiple vertices to the TriMesh which can be referred to with appendTriangle() or appendIndices()
    @CxxMethod
    public void appendPositions(@CxxConst Vec3 positions, @NULong long num);

    //! Appends multiple vertices to the TriMesh which can be referred to with appendTriangle() or appendIndices()
    @CxxMethod
    public void appendPositions(@CxxConst Vec4 positions, @NULong long num);

    //! Appends a single normal
    @CxxMethod
    public void appendNormal(@CxxConst @CxxByReference Vec3 normal);

    //! Functions similarly to appendPositions(), appending multiple normals at once.
    @CxxMethod
    public void appendNormals(@CxxConst Vec3 normals, @NULong long num);

    //! Appends a single tangent
    @CxxMethod
    public void appendTangent(@CxxConst @CxxByReference Vec3 tangent);

    //! Functions similarly to appendPositions(), appending multiple tangents at once.
    @CxxMethod
    public void appendTangents(@CxxConst Vec3 tangents, @NULong long num);

    //! Appends a single bitangent
    @CxxMethod
    public void appendBitangent(@CxxConst @CxxByReference Vec3 bitangent);

    //! Functions similarly to appendPositions(), appending multiple bitangents at once.
    @CxxMethod
    public void appendBitangents(@CxxConst Vec3 bitangents, @NULong long num);

    //! Appends a single RGB color
    @CxxMethod
    public void appendColorRgb(@CxxConst @CxxByReference Color color);

    //! Appends a single RGBA color
    @CxxMethod
    public void appendColorRgba(@CxxConst @CxxByReference ColorA color);

    //! Synonym for appendTexCoord0; appends a texture coordinate for unit 0
    @CxxMethod
    public void appendTexCoord(@CxxConst @CxxByReference Vec2 v);

    //!	appends a 2D texture coordinate for unit 0
    @CxxMethod
    public void appendTexCoord0(@CxxConst @CxxByReference Vec2 v);

    //! appends a 2D texture coordinate for unit 1
    @CxxMethod
    public void appendTexCoord1(@CxxConst @CxxByReference Vec2 v);

    //! appends a 2D texture coordinate for unit 2
    @CxxMethod
    public void appendTexCoord2(@CxxConst @CxxByReference Vec2 v);

    //! appends a 2D texture coordinate for unit 3
    @CxxMethod
    public void appendTexCoord3(@CxxConst @CxxByReference Vec2 v);

    //!	appends a 3D texture coordinate for unit 0
    @CxxMethod
    public void appendTexCoord0(@CxxConst @CxxByReference Vec3 v);

    //! appends a 3D texture coordinate for unit 1
    @CxxMethod
    public void appendTexCoord1(@CxxConst @CxxByReference Vec3 v);

    //! appends a 3D texture coordinate for unit 2
    @CxxMethod
    public void appendTexCoord2(@CxxConst @CxxByReference Vec3 v);

    //! appends a 3D texture coordinate for unit 3
    @CxxMethod
    public void appendTexCoord3(@CxxConst @CxxByReference Vec3 v);

    //!	appends a 4D texture coordinate for unit 0
    @CxxMethod
    public void appendTexCoord0(@CxxConst @CxxByReference Vec4 v);

    //! appends a 4D texture coordinate for unit 1
    @CxxMethod
    public void appendTexCoord1(@CxxConst @CxxByReference Vec4 v);

    //! appends a 4D texture coordinate for unit 2
    @CxxMethod
    public void appendTexCoord2(@CxxConst @CxxByReference Vec4 v);

    //! appends a 4D texture coordinate for unit 3
    @CxxMethod
    public void appendTexCoord3(@CxxConst @CxxByReference Vec4 v);

    //! Appends multiple RGB colors to the TriMesh
    @CxxMethod
    public void appendColors(@CxxConst Color rgbs, @NULong long num);

    //! Appends multiple RGBA colors to the TriMesh
    @CxxMethod
    public void appendColors(@CxxConst ColorA rgbas, @NULong long num);

    //! Appends multiple 2D texcoords for unit 0
    @CxxMethod
    public void appendTexCoords0(@CxxConst Vec2 texCoords, @NULong long num);

    //! Appends multiple 2D texcoords for unit 1
    @CxxMethod
    public void appendTexCoords1(@CxxConst Vec2 texCoords, @NULong long num);

    //! Appends multiple 2D texcoords for unit 2
    @CxxMethod
    public void appendTexCoords2(@CxxConst Vec2 texCoords, @NULong long num);

    //! Appends multiple 2D texcoords for unit 3
    @CxxMethod
    public void appendTexCoords3(@CxxConst Vec2 texCoords, @NULong long num);

    //! Appends multiple 3D texcoords for unit 0
    @CxxMethod
    public void appendTexCoords0(@CxxConst Vec3 texCoords, @NULong long num);

    //! Appends multiple 3D texcoords for unit 1
    @CxxMethod
    public void appendTexCoords1(@CxxConst Vec3 texCoords, @NULong long num);

    //! Appends multiple 3D texcoords for unit 2
    @CxxMethod
    public void appendTexCoords2(@CxxConst Vec3 texCoords, @NULong long num);

    //! Appends multiple 3D texcoords for unit 3
    @CxxMethod
    public void appendTexCoords3(@CxxConst Vec3 texCoords, @NULong long num);

    //! Appends multiple 4D texcoords for unit 0
    @CxxMethod
    public void appendTexCoords0(@CxxConst Vec4 texCoords, @NULong long num);

    //! Appends multiple 4D texcoords for unit 1
    @CxxMethod
    public void appendTexCoords1(@CxxConst Vec4 texCoords, @NULong long num);

    //! Appends multiple 4D texcoords for unit 2
    @CxxMethod
    public void appendTexCoords2(@CxxConst Vec4 texCoords, @NULong long num);

    //! Appends multiple 4D texcoords for unit 3
    @CxxMethod
    public void appendTexCoords3(@CxxConst Vec4 texCoords, @NULong long num);

    //! Appends a single triange whose 3 vertices are at indices \a v0, \a v1 and \a v2
    @CxxMethod
    public void appendTriangle(@CxxUnsigned int v0, @CxxUnsigned int v1, @CxxUnsigned int v2);

    //! Appends \a num indices to the TriMesh pointed to by \a indices
    @CxxMethod
    public void appendIndices(@CxxUnsigned IntPtr indices, @NULong long num);

    //! Returns the total number of indices in the TriMesh.
    @CxxMethod(isConst = true)
    @NULong
    public long getNumIndices();

    //! Returns the total number of triangles contained by the TriMesh.
    @CxxMethod(isConst = true)
    @NULong
    public long getNumTriangles();

    //! Returns the total number of indices contained by the TriMesh.
    @CxxMethod(isConst = true)
    @NULong
    public long getNumVertices();

    /*
        //! Copies the 3 vertices of triangle number \a idx into \a a, \a b and \a c. Assumes vertices are 3D
        void		getTriangleVertices( size_t idx, vec3 *a, vec3 *b, vec3 *c ) const;
        //! Copies the 3 vertices of triangle number \a idx into \a a, \a b and \a c. Assumes vertices are 2D
        void		getTriangleVertices( size_t idx, Vec2 *a, vec2 *b, vec2 *c ) const;
        //! Copies the 3 normals of triangle number \a idx into \a a, \a b and \a c.
        void		getTriangleNormals( size_t idx, vec3 *a, vec3 *b, vec3 *c ) const;
        //! Copies the 3 tangents of triangle number \a idx into \a a, \a b and \a c.
        void		getTriangleTangents( size_t idx, vec3 *a, vec3 *b, vec3 *c ) const;
        //! Copies the 3 bitangents of triangle number \a idx into \a a, \a b and \a c.
        void		getTriangleBitangents( size_t idx, vec3 *a, vec3 *b, vec3 *c ) const;


        //! Returns a pointer to the positions of the mesh as vec<DIM>*. For example, for a TriMesh with 3D vertices, call getPositions<3>().
        template<uint8_t DIM>
                const typename VECDIM<DIM,float>::TYPE*	getPositions() const { assert(mPositionsDims==DIM); return (typename VECDIM<DIM,float>::TYPE*)mPositions.data(); }
        //! Returns a pointer to the positions of theTriMesh as vec<DIM>*. For example, for a TriMesh with 3D vertices, call getPositions<3>().
        template<uint8_t DIM>
        typename VECDIM<DIM,float>::TYPE*		getPositions() { assert(mPositionsDims==DIM); return (typename VECDIM<DIM,float>::TYPE*)mPositions.data(); }
        //! Returns a reference to the std::vector<vec3> for the TriMesh's normals.
        std::vector<vec3>&				getNormals() { return mNormals; }
        //! Returns a reference to the std::vector<vec3> for the TriMesh's normals.
        const std::vector<vec3>&		getNormals() const { return mNormals; }
        //! Returns a reference to the std::vector<vec3> for the TriMesh's tangents.
        std::vector<vec3>&				getTangents() { return mTangents; }
        //! Returns a reference to the std::vector<vec3> for the TriMesh's tangents.
        const std::vector<vec3>&		getTangents() const { return mTangents; }
        //! Returns a reference to the std::vector<vec3> for the TriMesh's bitangents.
        std::vector<vec3>&				getBitangents() { return mBitangents; }
        //! Returns a reference to the std::vector<vec3> for the TriMesh's bitangents.
        const std::vector<vec3>&		getBitangents() const { return mBitangents; }
        //! Returns a pointer to the colors of the TriMesh vec<DIM>*. For example, to get RGB colors, call getColors<3>().
        template<uint8_t DIM>
        typename COLORDIM<DIM,float>::TYPE*			getColors() { assert(mColorsDims==DIM); return (typename COLORDIM<DIM,float>::TYPE*)mColors.data(); }
        //! Returns a pointer to the colors of the TriMesh vec<DIM>*. For example, to get RGB colors, call getColors<3>().
        template<uint8_t DIM>
                const typename COLORDIM<DIM,float>::TYPE*	getColors() const { assert(mColorsDims==DIM); return (typename COLORDIM<DIM,float>::TYPE*)mColors.data(); }
        //! Returns a pointer to the TexCoord0 values of the TriMesh vec<DIM>*. For example, if the TriMesh has 2D TexCoord0 values, use getTexCoords0<2>().
        template<uint8_t DIM>
        typename VECDIM<DIM,float>::TYPE*		getTexCoords0() { assert(mTexCoords0Dims==DIM); return (typename VECDIM<DIM,float>::TYPE*)mTexCoords0.data(); }
        //! Returns a pointer to the TexCoord0 values of the TriMesh vec<DIM>*. For example, if the TriMesh has 2D TexCoord0 values, use getTexCoords0<2>().
        template<uint8_t DIM>
                const typename VECDIM<DIM,float>::TYPE*	getTexCoords0() const { assert(mTexCoords0Dims==DIM); return (typename VECDIM<DIM,float>::TYPE*)mTexCoords0.data(); }
        //! Returns a pointer to the TexCoord1 values of the TriMesh vec<DIM>*. For example, if the TriMesh has 2D TexCoord1 values, use getTexCoords1<2>().
        template<uint8_t DIM>
        typename VECDIM<DIM,float>::TYPE*		getTexCoords1() { assert(mTexCoords1Dims==DIM); return (typename VECDIM<DIM,float>::TYPE*)mTexCoords1.data(); }
        //! Returns a pointer to the TexCoord1 values of the TriMesh vec<DIM>*. For example, if the TriMesh has 2D TexCoord1 values, use getTexCoords1<2>().
        template<uint8_t DIM>
                const typename VECDIM<DIM,float>::TYPE*	getTexCoords1() const { assert(mTexCoords1Dims==DIM); return (typename VECDIM<DIM,float>::TYPE*)mTexCoords1.data(); }
        //! Returns a pointer to the TexCoord2 values of the TriMesh vec<DIM>*. For example, if the TriMesh has 2D TexCoord2 values, use getTexCoords2<2>().
        template<uint8_t DIM>
        typename VECDIM<DIM,float>::TYPE*		getTexCoords2() { assert(mTexCoords2Dims==DIM); return (typename VECDIM<DIM,float>::TYPE*)mTexCoords2.data(); }
        //! Returns a pointer to the TexCoord2 values of the TriMesh vec<DIM>*. For example, if the TriMesh has 2D TexCoord2 values, use getTexCoords2<2>().
        template<uint8_t DIM>
                const typename VECDIM<DIM,float>::TYPE*	getTexCoords2() const { assert(mTexCoords2Dims==DIM); return (typename VECDIM<DIM,float>::TYPE*)mTexCoords2.data(); }
        //! Returns a pointer to the TexCoord3 values of the TriMesh vec<DIM>*. For example, if the TriMesh has 2D TexCoord3 values, use getTexCoords3<2>().
        template<uint8_t DIM>
        typename VECDIM<DIM,float>::TYPE*		getTexCoords3() { assert(mTexCoords3Dims==DIM); return (typename VECDIM<DIM,float>::TYPE*)mTexCoords3.data(); }
        //! Returns a pointer to the TexCoord3 values of the TriMesh vec<DIM>*. For example, if the TriMesh has 2D TexCoord3 values, use getTexCoords3<2>().
        template<uint8_t DIM>
                const typename VECDIM<DIM,float>::TYPE*	getTexCoords3() const { assert(mTexCoords3Dims==DIM); return (typename VECDIM<DIM,float>::TYPE*)mTexCoords3.data(); }
        //! Trimesh indices are ordered such that the indices of triangle T are { indices[T*3+0], indices[T*3+1], indices[T*3+2] }
        std::vector<uint32_t>&			getIndices() { return mIndices; }
        //! Trimesh indices are ordered such that the indices of triangle T are { indices[T*3+0], indices[T*3+1], indices[T*3+2] }
        const std::vector<uint32_t>&	getIndices() const { return mIndices; }

        //! Returns a const reference to the position buffer.
        const std::vector<float>& getBufferPositions() const { return mPositions; }
        //! Returns a reference to the position buffer.
        std::vector<float>& getBufferPositions() { return mPositions; }
        //! Returns a const reference to the colors buffer.
        const std::vector<float>& getBufferColors() const { return mColors; }
        //! Returns a reference to the colors buffer.
        std::vector<float>& getBufferColors() { return mColors; }
        //! Returns a const reference to the texCoords0 buffer.
        const std::vector<float>& getBufferTexCoords0() const { return mTexCoords0; }
        //! Returns a reference to the texCoords0 buffer.
        std::vector<float>& getBufferTexCoords0() { return mTexCoords0; }
        //! Returns a const reference to the texCoords1 buffer.
        const std::vector<float>& getBufferTexCoords1() const { return mTexCoords1; }
        //! Returns a reference to the texCoords1 buffer.
        std::vector<float>& getBufferTexCoords1() { return mTexCoords1; }
        //! Returns a const reference to the texCoords2 buffer.
        const std::vector<float>& getBufferTexCoords2() const { return mTexCoords2; }
        //! Returns a reference to the texCoords2 buffer.
        std::vector<float>& getBufferTexCoords2() { return mTexCoords2; }
        //! Returns a const reference to the texCoords3 buffer.
        const std::vector<float>& getBufferTexCoords3() const { return mTexCoords3; }
        //! Returns a reference to the texCoords3 buffer.
        std::vector<float>& getBufferTexCoords3() { return mTexCoords3; }
    */
    //! Calculates the bounding box of all vertices. Fails if the positions are not 3D.
    @CxxMethod(isConst = true)
    @CxxByValue
    public AxisAlignedBox calcBoundingBox();

    //! Calculates the bounding box of all vertices as transformed by \a transform. Fails if the positions are not 3D.
    @CxxMethod(isConst = true)
    @CxxByValue
    public AxisAlignedBox calcBoundingBox(@CxxConst @CxxByReference Mat4 transform);

    //! Fills this TriMesh with the data from a binary file, which was created with TriMesh::write().
    @CxxMethod
    public void read(@CxxConst @CxxByReference SharedPtr<DataSource> dataSource);

    //! Writes this TriMesh out to a binary data file.
    @CxxMethod(isConst = true)
    public void write(@CxxConst @CxxByReference SharedPtr<DataTarget> dataTarget);

    //! Writes this TriMesh out to a binary data file. If \a writeNormals or \a writeTangents is \c true, normals and/or tangents are written to the file.
    @CxxMethod(isConst = true)
    public void write(@CxxConst @CxxByReference SharedPtr<DataTarget> dataTarget, boolean writeNormals, boolean writeTangents);

    //! Writes this TriMesh out to a binary data file. You can specify which attributes to write by supplying a list of \a attribs.
    @CxxMethod(isConst = true)
    public void write(@CxxConst @CxxByReference SharedPtr<DataTarget> dataTarget, @CxxConst @CxxByReference AttribSet attribs);

    /*! Adds or replaces normals by calculating them from the vertices and faces. If \a smooth is TRUE,
        similar vertices are grouped together to calculate their average. This will not change the mesh,
        nor will it affect texture mapping. If \a weighted is TRUE, larger polygons contribute more to
        the calculated normal. Renormalization requires 3D vertices. */
/*    bool		recalculateNormals( bool smooth = false, bool weighted = false );
    //! Adds or replaces tangents by calculating them from the normals and texture coordinates. Requires 3D normals and 2D texture coordinates.
    bool		recalculateTangents();
    //! Adds or replaces bitangents by calculating them from the normals and tangents. Requires 3D normals and tangents.
    bool		recalculateBitangents();
*/
    /*! Subdivide each triangle of the TriMesh into \a division times division triangles. Division less than 2 leaves the mesh unaltered.
        Optionally, vertices are normalized if \a normalize is TRUE. */
    /*void		subdivide( int division = 2, bool normalize = false );*/

    //! Create TriMesh from vectors of vertex data.
/*	static TriMesh		create( std::vector<uint32_t> &indices, const std::vector<ColorAf> &colors,
                               const std::vector<vec3> &normals, const std::vector<vec3> &positions,
							   const std::vector<vec2> &texCoords );*/
/*
    // geom::Source virtuals
    geom::Primitive		getPrimitive() const override { return geom::Primitive::TRIANGLES; }
    uint8_t				getAttribDims( geom::Attrib attr ) const override;
    geom::AttribSet		getAvailableAttribs() const override; throw new CxxExpectedGeneratedCodeException();*/
}
//}
